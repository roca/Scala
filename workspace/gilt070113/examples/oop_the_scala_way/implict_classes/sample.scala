import org.joda.time.DateTime

implicit class DateUtil(val number : Int) {
  def days(when: String) = {
    when match {
      case "ago" =>
        val today = new DateTime
        today.minusDays(number)
      case _ =>
    }
  }
}

val ago = "ago"
println(2 days ago)




