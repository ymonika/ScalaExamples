package com

import java.io.{FileNotFoundException, FileReader}

import Run._

import scala.collection.mutable.{TreeMap, TreeSet}
import scala.io.Source

object HelloWorld {

  var factor= 12;
  var multiplier = (i:Int) => i*factor;

  def main(args: Array[String]): Unit = {
    4 times println("hsjdfsdjfgndmf")
    var s = "hello";
    s="hello1111";
    TreeMap
    TreeSet
    println(addNumbers(10,11))
    println("jshdfjdnfdnfdnmff  " + s)
    Symbol.apply("hjhj")
    println(multiplier(1))
    println(multiplier(2))
    println(multiplier(3))
    println(multiplier(4))
    println(multiplier(5))
    println(multiplier(6))
    println(multiplier(7))
    println(multiplier(8))
    println(multiplier(9))
    println(multiplier(10))

    try {
      val f = new FileReader( "input.txtxt");
    }catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case x: Exception => {
        println("Missing file exception")
      }
    } finally {
      println("finally")
    }

      }

  def addNumbers(a:Int, b:Int) : Int = {
    var sum: Int = 0
    sum = a+b
    sum
  }

}

final case class Symbol private(name: String) {

  override def toString:String = { "name: "+name }
}
