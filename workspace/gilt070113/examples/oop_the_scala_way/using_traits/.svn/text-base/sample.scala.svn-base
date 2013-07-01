trait Friend {
  val name : String
  def listen() = println(s"I'm $name listening...")
}

class Human(val name : String) extends Friend

val sam = new Human("Sam")
sam.listen()
  
class Animal(val name : String)
class Dog(override val name : String) extends
  Animal(name) with Friend

val buddy = new Dog("Buddy")
buddy.listen()

class Cat(override val name : String) extends
  Animal(name)
  
//val alf = new Cat("Alf")
//alf.listen()
  
val joe = new Cat("Joe") with Friend
joe.listen()
