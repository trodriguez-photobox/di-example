package com.photobox.example.di.automatic_di

import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions._
import org.slf4j.LoggerFactory

object Main {


  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Starting DI framework")

    val injector = Guice.createInjector(new MainModule())
    val app = injector.instance[App]
    app.startApp()
  }

}

