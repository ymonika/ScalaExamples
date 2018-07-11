package com

trait Equal {

  def isEqual(x: Any) : Boolean
  def notEqual(x: Any) : Boolean = !isEqual(x)

}
