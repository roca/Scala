def totalValue(values: List[Int],
  selector: Int => Boolean = {e => true }) = {
  var total = 0
  for(i <- values) {
    if(selector(i)) total += i
  }
  total
}

val numbers = List(1, 2, 3, 4, 5, 6)

totalValue(numbers, _ > 4)

totalValue(numbers) { _ > 4 }
//This is more idiomatic way to
//pass lambda expressions, but
//it does not quite readily work in Scala.


