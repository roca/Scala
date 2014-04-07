class Car(val year : Int, var miles : Int) {
  private var gasLevel : Int = 0
  println("creating a car")
  //this is the primary constructor
  
  def this(year : Int, miles : Int, levelOfGas :Int) = {
    this(year, miles)
    println("using auxilary constr")
    gasLevel = levelOfGas
  }
  
  def drive(dist : Int) = {
    miles += dist
  }
}

val car1 = new Car(2013, 0, 100)
