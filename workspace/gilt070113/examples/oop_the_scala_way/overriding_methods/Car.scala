class Vehicle(val year : Int, var miles : Int) {
  def drive(dist: Int) = {
    println("Vehicle driving...")
  }
}


class Car(override val year: Int) extends 
  Vehicle(year, 0) {
    override def drive(dist: Int) = {
      println("Car driving...")
      super.drive(10)
    }
  }
  
val car1 = new Car(2013)
car1.drive(10)