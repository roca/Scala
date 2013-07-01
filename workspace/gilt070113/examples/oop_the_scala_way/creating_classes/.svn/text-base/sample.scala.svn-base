class Car(val year : Int, var miles : Int) {
  private var gasLevel : Int = 0
  println("creating a car")
  //this is the primary constructor
  
  def drive(dist : Int) = {
    miles += dist
  }
}

val car1 = new Car(2013, 0)
println(car1.year)
println(car1.miles)
car1 drive 10
println(car1.miles)

//car1.year = 2014 //nope
car1.miles = 22 //allows change to this
println(car1.miles)

//println(car1.gasLevel) //nope.