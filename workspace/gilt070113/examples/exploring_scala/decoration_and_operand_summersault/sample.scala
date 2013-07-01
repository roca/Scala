class MyList {
  def prefix(number: Int) = println("prefixing")
  
  def prefixTo_:(number: Int) =
    println("prefixingTo")
}

val myList = new MyList
myList.prefix(0)
//the intent is for 0 to be ahead of
//current (presumed) elements in this
//hypothetical list

//it would be nice to say
//0.prefix(myList)
//0 prefix myList

//oops, that would not work because
//we don't want to add prefix method
//to Int afterall, not a good method
//to add, would pollute that class

0 prefixTo_: myList
//if a method name ends with a colon
//then that method (including the 
//  colon in it name) is bound to
// the right operand as target.
//the same as calling

myList.prefixTo_:(0)