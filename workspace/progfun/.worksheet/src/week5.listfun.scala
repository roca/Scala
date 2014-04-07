package week5

object listfun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
 val nums = List(2,-4,5,7,1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(62); 
   
  val fruits = List("apple","pineapple","orange","banna");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(123); 
   def squareList(xs:List[Int]): List[Int] = xs match {
   case Nil => Nil
   case y :: ys => (y*y) :: squareList(ys)
   };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(20); val res$0 = 
   squareList(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(72); 
   
   def squareList2(xs:List[Int]): List[Int] =
   xs map (x => x *x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(25); val res$1 = 
   
   squareList2(nums);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(28); val res$2 = 
 
 nums filter ( x => x >0);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(29); val res$3 = 
 nums filterNot ( x => x >0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(29); val res$4 = 
 
 nums partition(x => x >0);System.out.println("""res4: (List[Int], List[Int]) = """ + $show(res$4));$skip(29); val res$5 = 
 
 nums takeWhile(x => x >0);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(29); val res$6 = 
 
 nums dropWhile(x => x >0);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(24); val res$7 = 
 
 nums span(x => x >0);System.out.println("""res7: (List[Int], List[Int]) = """ + $show(res$7));$skip(48); 
 
 val data = List("a","a","a","b","c","c","a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(162); 
 def pack[T](xs:List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xsl =>
    val (first,rest) = xs span ( y => y ==x)
    first :: pack(rest)
 };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(14); val res$8 = 
 
 pack(data);System.out.println("""res8: List[List[String]] = """ + $show(res$8));$skip(90); 
 
 
 def encode[T](xs:List[T]): List[(T,Int)] =
 pack(xs) map (ys => (ys.head,ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(18); val res$9 = 
 
 
 encode(data);System.out.println("""res9: List[(String, Int)] = """ + $show(res$9));$skip(85); 
 
 def concat[T](xs: List[T], ys: List[T]): List[T] =
    (xs foldRight ys) (_ :: _);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(111); 
    
  
def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( (A, B) => f(A) :: B);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(81); 

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)(  (A, B) => B + 1 );System.out.println("""lengthFun: [T](xs: List[T])Int""");$skip(27); val res$10 = 
    
    
 lengthFun(data);System.out.println("""res10: Int = """ + $show(res$10));$skip(36); val res$11 = 
  mapFun(nums, ((x:Int) => x * 2) );System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(23); val res$12 = 
  
  concat(data,data);System.out.println("""res12: List[String] = """ + $show(res$12))}
  

}
