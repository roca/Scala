val two = 2
println(two + 3)

println(two.+(3))

//Scala has no operators, but
//methods can have symbols in their name
//Scala has method name precedence

class MyClass {
  def +(other: MyClass) = {
    println("+ called")
    this
  }
  
  def *(other: MyClass) = {
    println("* called")
    this
  }
}

val obj1 = new MyClass()
val obj2 = new MyClass
val obj3 = new MyClass

obj1 + obj2 * obj3


for(i <- 1.to(3)) { println(i) }

for(i <- 1 to 3) { println(i) }

