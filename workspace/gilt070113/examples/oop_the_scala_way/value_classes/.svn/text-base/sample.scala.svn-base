import org.joda.time.DateTime

object Sample extends App {
  implicit class DateUtil(val number : Int) extends AnyVal {
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

  //we can eliminate the object creation overhead by
  //turning the implicit into a value class. 
  
  //Take a look into the bytecode before this change
  //and after, you will see new before, but not any more
  //for creating object of DataUtil.
}

