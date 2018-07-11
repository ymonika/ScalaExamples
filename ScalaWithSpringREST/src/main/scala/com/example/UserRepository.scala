package com.example.controller

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends CrudRepository[Users, String] {
  def findUserByUsername(username: String): Users
}