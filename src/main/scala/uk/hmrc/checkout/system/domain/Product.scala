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
case class Product(id : String, price : BigDecimal) {
  override def toString = id
}