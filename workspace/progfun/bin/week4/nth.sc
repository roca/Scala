import week4._

object nth {
  def nth[T](n: Int, xs: List[T]): T =
   if (xs.isEmpty) throw new IndexOutOfBoundsException
   else if (n == 0) xs.head
   else nth(n-1, xs.tail)                         //> nth: [T](n: Int, xs: week4.List[T])T
   
   
   val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week4.Cons[Int] = week4.Cons@1d3c468a
   
   nth(2,list)  == 3                              //> res0: Boolean = true
   nth(4,list)                                    //> java.lang.IndexOutOfBoundsException
                                                  //| 	at nth$$anonfun$main$1.nth$1(nth.scala:5)
                                                  //| 	at nth$$anonfun$main$1.apply$mcV$sp(nth.scala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at nth$.main(nth.scala:3)
                                                  //| 	at nth.main(nth.scala)
}