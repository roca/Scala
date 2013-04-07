package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

import models._
import Formats._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def listSamples() = Action {
    val samples = Sample.findAll()


    val json = Json.toJson(samples)

    Ok(json).as("application/json")
  }


}