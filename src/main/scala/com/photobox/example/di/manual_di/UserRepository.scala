package com.photobox.example.di.manual_di

import org.slf4j.LoggerFactory

class UserRepository {

  val logger = LoggerFactory.getLogger(this.getClass)

  var user = User(
    firstName = "John",
    lastName = "Doe",
    email = "john.doe@gmail.com",
    age = 24
  )

  def findById(id: Long): User = {
    logger.info(s"Will get user with id $id")

    logger.info(s"Found user $user")
    user
  }

  def save(user: User): Unit = {
    logger.info(s"Will save user $user")

    this.user = user
  }
}
