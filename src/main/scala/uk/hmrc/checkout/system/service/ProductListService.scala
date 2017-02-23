package uk.hmrc.checkout.system.service

import uk.hmrc.checkout.system.domain.{Offer, Product}
import uk.hmrc.checkout.system.service.InMemoryProductListService.products


/**
 * Created by praveen reddy on 23/02/2017.
 */

/**
 * Product List Service Trait
 */
trait ProductListService {
  def getProduct(id:String) : Option[Product] = {
    None
  }
}

/**
 * In Memory Product List Service companion object to provide in-memory static data
 */
object InMemoryProductListService {
  private val products = Map (
    "APPLE" -> new Product("Apple", 0.60, new Offer(2, 1)),
    "ORANGE" -> new Product("Orange", 0.25, new Offer(3, 2))
  )
}

/**
 * In Memory Product List Service to provide products from in-memory
 */
trait  InMemoryProductListService extends ProductListService {
  override def getProduct(id:String) : Option[Product] = {
    products.get(id.toUpperCase)
  }
}
