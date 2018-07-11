package com.example.controller

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Users {

  @Id var id = 0L
   var name = null
   var mobileNo = null

  def getId: Long = id

  def getName: String = name

  def getMobileNo: String = mobileNo

  override def toString: String = "User{" + "id=" + id + ", name='" + name + '\'' + ", mobileNo='" + mobileNo + '\'' + '}'

}