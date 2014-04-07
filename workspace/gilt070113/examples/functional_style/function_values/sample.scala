def totalValue(values: List[Int],
  selector: Int => Boolean = {e => true }) = {
  var total = 0
  for(i <- values) {
    if(selector(i)) total += i
  }
  total
}

val numbers = List(1, 2, 3, 4, 5, 6)
println(totalValue(numbers))
println(totalValue(numbers, {e => e % 2 == 0}))
println(totalValue(numbers, e => e % 2 != 0))

println(totalValue(numbers, _ > 3))

println(totalValue(numbers, (_ > 4)))
