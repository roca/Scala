def sqrt(number: Int) = {
  if(number < 0)
    throw new RuntimeException("negative not allowed")
    
  math.sqrt(number)
}

def callSqrt(number: Int) = {
  try {
    println(sqrt(number))
  } catch {
    case ex: RuntimeException =>
      println("oops: " + ex)
  } finally {
    println("Finally...")
  }
}

callSqrt(4)
callSqrt(-2)