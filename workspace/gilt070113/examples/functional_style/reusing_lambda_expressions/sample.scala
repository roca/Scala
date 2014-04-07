def totalValue(values: List[Int],
  selector: Int => Boolean = {e => true }) = {
  var total = 0
  for(i <- values) {
    if(selector(i)) total += i
  }
  total
}

val numbers = List(1, 2, 3, 4, 5, 6)
println(totalValue(numbers, _ > 4))
println(totalValue(numbers, _ > 4))
//duplication of the function value is bad

val isGreaterThan4 = {e:Int => e > 4}
println(totalValue(numbers, isGreaterThan4))
println(totalValue(numbers, isGreaterThan4))







