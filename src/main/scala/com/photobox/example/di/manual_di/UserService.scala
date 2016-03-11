package com.photobox.example.di.manual_di

import net.codingwell.scalaguice.InjectorExtensions._
import org.slf4j.LoggerFactory

class UserService {

  val logger = LoggerFactory.getLogger(this.getClass)
  val userRepository = Global.injector.instance[UserRepository]

  def updateUserFirstName(id: Long, firstName: String): Unit = {
    logger.info(s"Will update user $id with firstname $firstName")

    val user = userRepository.findById(id)
    val modifiedUser = user.copy(firstName = firstName)
    userRepository.save(modifiedUser)
  }

}
