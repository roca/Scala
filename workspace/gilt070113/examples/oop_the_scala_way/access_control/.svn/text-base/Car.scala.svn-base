import scala.beans._

class Car(val year : Int, var miles : Int) {
  private var gasLevel : Int = 0
  private[this] var tirePressure : Int = 0
  
  def tow(other : Car) = {
    other.gasLevel -= 1 //like in Java
    //other.tirePressure -= 1 //nope like in Ruby
  }
}

val car1 = new Car(2013, 0)
val car2 = new Car(1984, 0)
//println(car1.gasLevel) //nope
car1.tow(car2)
println("playing with access control")