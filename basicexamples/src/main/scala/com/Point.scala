package com

class Point(xc: Int, yc: Int) extends Equal {

  var x= xc
  var y= yc

  def isEqual(obj: Any) = obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == y

}

object Runner {
  def main(args: Array[String]): Unit = {
    val point1 = new Point(2,2)
    val point2 = new Point(2,2)
    val point3 = new Point(2,3)

    println (point1.isEqual(point2))
    print(point3.isEqual(point1))

  }
}
