package com.photobox.example.di.manual_di

import com.google.inject.Guice

object Global {

  lazy val injector = Guice.createInjector(new MainModule())
}
