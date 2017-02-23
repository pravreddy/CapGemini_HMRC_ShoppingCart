package uk.hmrc.checkout.system.service

import uk.hmrc.checkout.system.domain.Product

/**
 * Created by praveen reddy on 23/02/2017.
 */

class CheckOutSystemService (input : Array[String]) extends ProductListService {
  /**
   * Parses array of product ids to list of products
   */
  private val basket = input.foldRight(List.empty[Product]) {
    (productId:String, list: List[Product])  =>
      val product = getProduct(productId)
      if(product.nonEmpty) {
        product.get :: list
      }
      else
        list
  }

  /**
   * Groups basket by the products and returns a map containing products as keys and items qty as the value
   */
  private lazy val groupByProducts = basket.foldLeft(Map.empty[Product, Int]) {
    (products: Map[Product, Int], product: Product) =>
      products + (product -> (1 + products.getOrElse(product,0)))
  }


  /**
   * Calculates basket total as per products offers
   */
  lazy val total = groupByProducts.foldLeft(0.0) {
    (total, items) => total + (items._1.price.toDouble * ((items._2 % items._1.offer.getQty) +
      (items._2 / items._1.offer.getQty * items._1.offer.forPriceOfQty)))
  }
}
