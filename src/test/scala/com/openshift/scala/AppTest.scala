package com.openshift.scala

import com.openshift.scala.controller.PersonController
import com.openshift.scala.model.Person
import com.twitter.finatra.test.MockApp
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class AppTest extends FunSuite with ShouldMatchers{
  test("Get /persons should return 200") {
    val app = MockApp(new PersonController)

    val response = app.get("/persons")
    response.code should be(200)
    response.body should be("[{\"firstName\":\"Jack\",\"lastName\":\"Li\"}]")
  }
}
