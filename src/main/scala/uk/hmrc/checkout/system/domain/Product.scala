package uk.hmrc.checkout.system.domain

import uk.hmrc.checkout.system.domain.Product

/**
 * Created by praveen reddy on 23/02/2017.
 */

/**
 * Product Domain Object
 * @param id Product Id
 * @param price Product Price
 */
case class Product(id : String, price : BigDecimal , offer: Offer) {
  override def toString = id
}

/**
 * Product Offer Domain Object
 * @param getQty Get product items qty
 * @param forPriceOfQty For the price of qty
 */
case class Offer(getQty: Int, forPriceOfQty: Int)
