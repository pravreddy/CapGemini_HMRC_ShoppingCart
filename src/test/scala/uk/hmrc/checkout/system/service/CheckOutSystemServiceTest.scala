package uk.hmrc.checkout.system.service

import org.scalatest.FunSuite

/**
 * Created by praveen reddy on 23/02/2017.
 */
class CheckOutSystemServiceTest extends FunSuite {
  test("testTotalItemsPricesWithZeroItems") {
    val checkoutSystemTest = new CheckOutSystemService(Array()) with InMemoryProductListService
    assert(checkoutSystemTest.total == 0.0)
  }
  test("testTotalItemsPricesWithInvalidItems") {
    val checkoutSystemTest = new CheckOutSystemService(Array("apple", "orange", "invalide")) with InMemoryProductListService
    assert(checkoutSystemTest.total == 0.85)
  }

  test("testTotalItemsPrices") {
    var checkoutSystemTest = new CheckOutSystemService(Array("apple", "apple","orange","apple" )) with InMemoryProductListService
    assert(checkoutSystemTest.total == 1.45)
    checkoutSystemTest = new CheckOutSystemService(Array("orange", "orange")) with InMemoryProductListService
    assert(checkoutSystemTest.total == 0.5)
    checkoutSystemTest = new CheckOutSystemService(Array("orange", "orange", "orange")) with InMemoryProductListService
    assert(checkoutSystemTest.total == 0.5)
  }
}

