import akka.actor._

object Sample extends App {
  implicit val actorSystem = ActorSystem.create()

  val depp = actorSystem.actorOf(Props[HollywoodActor])
  val hanks = actorSystem.actorOf(Props[HollywoodActor])

  println(s"In main ${Thread.currentThread()}")
  depp ! "Sparrow"
  depp ! "Wonka"
  
  hanks ! "Gump"
  hanks ! "Lovell"
  println("sent request to play 2 roles to each")
  
  actorSystem.shutdown()  
}
