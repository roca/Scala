package week6



object test {
  val xs = Array(1,2,3,44)                        //> xs  : Array[Int] = Array(1, 2, 3, 44)
  xs map ( x => x * 2)                            //> res0: Array[Int] = Array(2, 4, 6, 88)
  
  xs.sum                                          //> res1: Int = 50
  xs.max                                          //> res2: Int = 44
  
  val s = "Hello World.,"                         //> s  : String = Hello World.,
  s.replaceAll("[^\\w]","")                       //> res3: String = HelloWorld
  s exists(c => c.isUpper)                        //> res4: Boolean = true
  s forall(c => c.isUpper)                        //> res5: Boolean = false
  
  val pairs = List(1,2,3) zip s                   //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
  pairs.unzip                                     //> res6: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
  
  s flatMap (c => List('.',c))                    //> res7: String = .H.e.l.l.o. .W.o.r.l.d...,
  
  s filter(c => c.isUpper)                        //> res8: String = HW
  
  val w = "badc"                                  //> w  : String = badc
  val x = w.sortBy( x => x)                       //> x  : String = abcd
  val ls = w groupBy(c => c) toList               //> ls  : List[(Char, String)] = List((b,b), (d,d), (a,a), (c,c))
  
  ls map {case (x,y) => (x,y.length)}             //> res9: List[(Char, Int)] = List((b,1), (d,1), (a,1), (c,1))
     
 def isPrime(n:Int): Boolean = (2 until n) forall ( d => (n % d) != 0)
                                                  //> isPrime: (n: Int)Boolean
   isPrime(5)                                     //> res10: Boolean = true
   isPrime(6)                                     //> res11: Boolean = false
   
    
}