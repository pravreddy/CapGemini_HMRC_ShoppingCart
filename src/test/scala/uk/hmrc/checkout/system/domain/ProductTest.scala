package uk.hmrc.checkout.system.domain

import org.scalatest.FunSuite
import uk.hmrc.checkout.system.domain.Offer

/**
 * Created by praveen reddy on 23/02/2017.
 */
class ProductTest extends FunSuite {
  test("testDoaminClass") {
    val product = new Product("Apple", 60, new Offer(2, 1) )
    assert(product.toString == "Apple")
    assert(product.id == "Apple")
    assert(product.price == 60)
    assert(product.offer.getQty == 2)
    assert(product.offer.forPriceOfQty == 1)
  }
}

