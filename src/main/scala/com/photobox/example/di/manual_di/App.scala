package com.photobox.example.di.manual_di

import net.codingwell.scalaguice.InjectorExtensions._
import org.slf4j.LoggerFactory

object App {

  val logger = LoggerFactory.getLogger(this.getClass)
  val userService = Global.injector.instance[UserService]

  def startApp(): Unit = {
    logger.info("Starting app")

    // Update firstname of user
    userService.updateUserFirstName(153L, "Bob")
  }

}
