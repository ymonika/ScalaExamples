package com.example.controller

import java.lang.Iterable

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired userRepo: UserRepository ) {

  def listUsers() : Iterable[Users] = {
    userRepo.findAll
  }

  def getUser(id: Long): Users = {
    userRepo.findOne(id.toString)
  }
  def createUser(users: Users): Long = {
    userRepo.save(users)
    users.id
  }


}