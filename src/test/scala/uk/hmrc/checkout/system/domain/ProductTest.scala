package uk.hmrc.checkout.system.domain

import org.scalatest.FunSuite

/**
 * Created by praveen reddy on 23/02/2017.
 */
class ProductTest extends FunSuite {
  test("testDoaminClass") {
    val product = new Product("Apple", 60)
    assert(product.toString == "Apple")
    assert(product.id == "Apple")
    assert(product.price == 60)
  }
}
