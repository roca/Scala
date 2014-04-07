package models

import play.api.libs.json._

object Formats {
      implicit object SampleFormat extends Format[Sample] {
              def writes(sample: Sample): JsValue = JsObject(
                          Seq("id" -> JsNumber(sample.id),
                              "name" -> JsString(sample.name)
                          )
              )

              def reads(json: JsValue): JsSuccess[Sample] = JsSuccess( Sample(
                  (json \ "id").as[Int],
                  (json \ "name").as[String]
              ))
        }
}

