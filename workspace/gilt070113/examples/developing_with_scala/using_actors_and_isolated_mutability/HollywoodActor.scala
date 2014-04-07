import akka.actor._

class HollywoodActor extends Actor {
  def receive = {
    case msg => 
      println(s"playing $msg in ${Thread.currentThread()}")
  }
}