package com


class Outer {

  class Inner {
    def f(x: String): Unit = {
      println(x)
    }
  }

  def ff(x: String) {
    (new Inner).f(x)
  }
}

object OuterRunner {

  def main(args: Array[String]): Unit = {
    (new Outer).ff("12232434")
    var arrayString= Array("zero", "one", "two","threee")
    var arrayDouble = Array(1.1, 2.2323, 2.45, 3.5, 3)
    //println(arrayString(0))

    for (i <- 1 to arrayString.length - 1) {
      println(arrayString(i))
    }


  }

  def recurcive(): Unit ={
    println("saddddddddddddddddd")
    recurcive()
  }
}
