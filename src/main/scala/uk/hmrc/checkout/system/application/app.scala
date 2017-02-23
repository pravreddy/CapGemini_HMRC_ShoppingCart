package uk.hmrc.checkout.system.application

import uk.hmrc.checkout.system.service.{InMemoryProductListService, CheckOutSystemService}

/**
 * Created by praveen reddy on 23/02/2017.
 */
object app {
  def main(args : Array[String]): Unit = {
    if(args.length == 0)
      println("Usage : run <product> <product>")
    else {
      val checkoutService = new CheckOutSystemService(args) with InMemoryProductListService
      println("[ %s ] => £ %.2f".format(args.mkString(", ").toUpperCase(), checkoutService.total))
    }
  }
}
