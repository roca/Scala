package week5

object listfun {
 val nums = List(2,-4,5,7,1)                      //> nums  : List[Int] = List(2, -4, 5, 7, 1)
   
  val fruits = List("apple","pineapple","orange","banna")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banna)
   def squareList(xs:List[Int]): List[Int] = xs match {
   case Nil => Nil
   case y :: ys => (y*y) :: squareList(ys)
   }                                              //> squareList: (xs: List[Int])List[Int]
   squareList(nums)                               //> res0: List[Int] = List(4, 16, 25, 49, 1)
   
   def squareList2(xs:List[Int]): List[Int] =
   xs map (x => x *x)                             //> squareList2: (xs: List[Int])List[Int]
   
   squareList2(nums)                              //> res1: List[Int] = List(4, 16, 25, 49, 1)
 
 nums filter ( x => x >0)                         //> res2: List[Int] = List(2, 5, 7, 1)
 nums filterNot ( x => x >0)                      //> res3: List[Int] = List(-4)
 
 nums partition(x => x >0)                        //> res4: (List[Int], List[Int]) = (List(2, 5, 7, 1),List(-4))
 
 nums takeWhile(x => x >0)                        //> res5: List[Int] = List(2)
 
 nums dropWhile(x => x >0)                        //> res6: List[Int] = List(-4, 5, 7, 1)
 
 nums span(x => x >0)                             //> res7: (List[Int], List[Int]) = (List(2),List(-4, 5, 7, 1))
 
 val data = List("a","a","a","b","c","c","a")     //> data  : List[String] = List(a, a, a, b, c, c, a)
 def pack[T](xs:List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xsl =>
    val (first,rest) = xs span ( y => y ==x)
    first :: pack(rest)
 }                                                //> pack: [T](xs: List[T])List[List[T]]
 
 pack(data)                                       //> res8: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a))
                                                  //| 
 
 
 def encode[T](xs:List[T]): List[(T,Int)] =
 pack(xs) map (ys => (ys.head,ys.length))         //> encode: [T](xs: List[T])List[(T, Int)]
 
 
 encode(data)                                     //> res9: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
 
 def concat[T](xs: List[T], ys: List[T]): List[T] =
    (xs foldRight ys) (_ :: _)                    //> concat: [T](xs: List[T], ys: List[T])List[T]
    
  
def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( (A, B) => f(A) :: B)//> mapFun: [T, U](xs: List[T], f: T => U)List[U]

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)(  (A, B) => B + 1 )          //> lengthFun: [T](xs: List[T])Int
    
    
 lengthFun(data)                                  //> res10: Int = 7
  mapFun(nums, ((x:Int) => x * 2) )               //> res11: List[Int] = List(4, -8, 10, 14, 2)
  
  concat(data,data)                               //> res12: List[String] = List(a, a, a, b, c, c, a, a, a, a, b, c, c, a)
  

}