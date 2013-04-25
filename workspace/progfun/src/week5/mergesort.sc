package week5

import scala.math.Ordering

object mergesort {
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
   val n = xs.length / 2
   if (n == 0) xs
   else {
   	def merge(xs: List[T],ys: List[T]): List[T] = (xs,ys) match {
   	  case (Nil,ys) => ys
   	  case (xs,Nil) => xs
   	  case (x::xs1,y::ys1) => if (ord.lt(x,y)) x :: merge(xs1,ys)
   	  												else y :: merge(xs,ys1)
   	}
   	
   	val (fst,snd) = xs splitAt n
   	merge(msort(fst),msort(snd))
   }
  }                                               //> msort: [T](xs: List[T])(implicit ord: scala.math.Ordering[T])List[T]
  
  val nums = List(2,-4,5,7,1)                     //> nums  : List[Int] = List(2, -4, 5, 7, 1)
  msort(nums)                                     //> res0: List[Int] = List(-4, 1, 2, 5, 7)
  
  val fruits = List("apple","pineapple","orange","banna")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banna)
  msort(fruits)                                   //> res1: List[String] = List(apple, banna, orange, pineapple)
}