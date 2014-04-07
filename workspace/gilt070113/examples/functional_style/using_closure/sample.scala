def totalValue(values: List[Int],
  selector: Int => Boolean = {e => true }) = {
  var total = 0
  for(i <- values) {
    if(selector(i)) total += i
  }
  total
}

val numbers = List(1, 2, 3, 4, 5, 6)

val isGreaterThan4 = {e:Int => e > 4}
println(totalValue(numbers, isGreaterThan4))
println(totalValue(numbers, isGreaterThan4))

val isGreaterThan3 = {e: Int => e > 3}
println(totalValue(numbers, isGreaterThan3))

//The above is duplicating the > function.

def isGreaterThan(pivot: Int) = {
  {e : Int => e > pivot}
  //this is a closure, because it has to
  //closure over the defining context
  //aka lexical scoping, before we can
  //use it.
}

println(totalValue(numbers, isGreaterThan(3)))
println(totalValue(numbers, isGreaterThan(4)))




