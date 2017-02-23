ShoppingCart
============
Continuous Integration (CI) : [![Build Status](https://travis-ci.org/pravreddy/CapGemini_HMRC_ShoppingCart.svg)](https://travis-ci.org/pravreddy/CapGemini_HMRC_ShoppingCart)

Code Coverage : [![codecov](https://codecov.io/gh/pravreddy/CapGemini_HMRC_ShoppingCart/branch/master/graph/badge.svg)](https://codecov.io/gh/pravreddy/CapGemini_HMRC_ShoppingCart)

Step 1: Shopping Cart
---------------------

● building a checkout system for a shop which only sells apples and oranges.

● Apples cost 60p and oranges cost 25p.

● Build a checkout system which takes a list of items scanned at the till and outputs the total cost.

● For example: [ Apple, Apple, Orange, Apple ] => £2.05

Step 2: Simple offers
----------------------

● The shop decides to introduce two new offers

    ○ buy one, get one free on Apples

    ○ 3 for the price of 2 on Oranges

Usage
-----
first start "sbt" in command prompt and run

```
run <product> <product>
```
Example
-------
```
run apple apple orange apple
```