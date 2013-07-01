def sqrt(number : Int) = {
  if(number >= 0)
    math.sqrt(number)
  else
    throw new RuntimeException("invalid input")
}

println(sqrt(4))
//what is the return type of the 
//function? It is still Double, 
//and the type verifier knows that
//throw is Nothing, which is compatible
//with anything.