package com.photobox.example.di.automatic_di

import javax.inject.Inject

import org.slf4j.LoggerFactory

class App @Inject()(userService: UserService) {

  val logger = LoggerFactory.getLogger(this.getClass)

  def startApp(): Unit = {
    logger.info("Starting app")

    // Update firstname of user
    userService.updateUserFirstName(153L, "Bob")
  }

}