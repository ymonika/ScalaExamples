package com

object Demo {

  val square = (x:Int) => x * x;

  def printMe(x: Int): Unit = {
    println(x)
  }

  /*def main(args: Array[String]) {
    /*Demo.printMe("Helloooooo")
    print(square.apply(10))*/
    //def array = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (x <- 0 to 20 ) {
      Demo.printMe(square.apply(x))

    }
  }*/

  def main(args: Array[String]) {
    def list = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- list)
      println(i)
  }


}
