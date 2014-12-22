package com.openshift.scala

import com.twitter.finatra._
import com.openshift.scala.controller.PersonController

object App extends FinatraServer {
  register(new PersonController())
}
