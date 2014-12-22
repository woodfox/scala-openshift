package com.openshift.scala.controller

import com.twitter.finatra.Controller
import com.openshift.scala.model.Person

class PersonController extends Controller {
  get("/persons") { request =>
    val person = Person("Jack", "Li")
    render.json(List(person)).toFuture
  }
}
