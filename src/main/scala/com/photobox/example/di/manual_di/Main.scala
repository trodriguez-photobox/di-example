package com.photobox.example.di.manual_di

import org.slf4j.LoggerFactory

object Main {

  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Starting DI framework")

    App.startApp()
  }

}
