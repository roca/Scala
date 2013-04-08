package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._
import play.api.libs.json._


case class Sample(id: Int, name: String)



object Sample {

  val simple = {
    get[Int]("id") ~
    get[String]("name") map {
      case id~name => Sample(id, name)
    }
  }

  def findAll(): Seq[Sample] = {
    DB.withConnection { implicit connection =>
      SQL("select id,name from samples where name is not null limit 10 ").as(Sample.simple *)
    }
  }

  def create(sample: Sample): Unit = {
    DB.withConnection { implicit connection =>
      SQL("insert into samples(name) values ({name})").on(
        'name -> sample.name
      ).executeUpdate()
    }
  }



}