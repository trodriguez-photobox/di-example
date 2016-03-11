package com.photobox.example.di.automatic_di

import com.google.inject.Inject
import org.slf4j.LoggerFactory

class UserService @Inject()(userRepository: UserRepository) {

  val logger = LoggerFactory.getLogger(this.getClass)

  def updateUserFirstName(id: Long, firstName: String): Unit = {
    logger.info(s"Will update user $id with firstname $firstName")

    val user = userRepository.findById(id)
    val modifiedUser = user.copy(firstName = firstName)
    userRepository.save(modifiedUser)
  }

}
