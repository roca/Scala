import org.joda.time.DateTime

class DateUtil(val number : Int) {
  def days(when: String) = {
    when match {
      case "ago" =>
        val today = new DateTime
        today.minusDays(number)
      case _ =>
    }
  }
}

implicit def int2WonderfulDateUtil(number : Int) = new DateUtil(number)

val ago = "ago"
println(2 days ago)




