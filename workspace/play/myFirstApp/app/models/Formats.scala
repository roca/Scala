package models

import play.api.libs.json.Format
import play.api.libs.json.JsValue
import play.api.libs.json.JsObject
import play.api.libs.json.JsNumber
import play.api.libs.json.JsString


object Formats {
      implicit object SampleFormat extends Format[Sample] {
              def writes(sample: Sample): JsValue = JsObject(
                          Seq("id" -> JsNumber(sample.id),
                              "name" -> JsString(sample.name)
                          )
              )

              def reads(json: JsValue): Sample = Sample(
                  (json \ "id").as[Int],
                  (json \ "name").as[String]
              )
        }
}

