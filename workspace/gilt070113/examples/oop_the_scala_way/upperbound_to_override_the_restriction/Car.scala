class Fruit {}
class Banana extends Fruit {}

def copy[T <: Fruit](from: Array[T]) = {
  
}

val fruits : Array[Fruit] = Array()
val bananas : Array[Banana] = Array()

copy(fruits)
copy(bananas)

//Base also we have Derived which extends Base
//Drived extends Base, but,
//by default, a collection of Derived does not
//extend a collection of Base.

//A basket of Banana is not substitutable where
//a basket of Fruits is expected.

//if copy is copying to the given collection,
//then this would certainly be a problem,
//we don't want it to put oranges, for example,
//into a basket of banana being treated as 
//a basket of fruits

//But, if we copy from the basket, into a
//basket of fruits, is it a problem?

//No, that is OK. In other words, thanks for
//protecting, but where is that override switch?

println("We can do this by specifying upperbound")






