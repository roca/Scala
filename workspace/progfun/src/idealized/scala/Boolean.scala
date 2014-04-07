package idealized.scala

abstract class Boolean {
   def ifThenElse[T](t: => T, e: => T): T
   def && (x: => Boolean): Boolean = ifThenElse(x, False)
   def || (x: => Boolean): Boolean = ifThenElse(True, x)
   def unary_! : Boolean = ifThenElse(False, True)
   def == (x:  Boolean): Boolean = ifThenElse(x, x.unary_!)
   def != (x: Boolean): Boolean = ifThenElse(x.unary_!, x)
}

object True extends idealized.scala.Boolean {
	def ifThenElse[T](t: => T, e: => T) = t
}
object False extends idealized.scala.Boolean {
	def ifThenElse[T](t: => T, e: => T) = e
}



