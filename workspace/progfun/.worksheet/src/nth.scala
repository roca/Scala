import week4._

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(176); 
  def nth[T](n: Int, xs: List[T]): T =
   if (xs.isEmpty) throw new IndexOutOfBoundsException
   else if (n == 0) xs.head
   else nth(n-1, xs.tail);System.out.println("""nth: [T](n: Int, xs: week4.List[T])T""");$skip(69); 
   
   
   val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week4.Cons[Int] = """ + $show(list ));$skip(25); val res$0 = 
   
   nth(2,list)  == 3;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(15); val res$1 = 
   nth(4,list);System.out.println("""res1: Int = """ + $show(res$1))}
}
