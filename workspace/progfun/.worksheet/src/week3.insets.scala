package week3

object insets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
	val t1 = new NonEmpty(3,Empty,Empty);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(20); 
	val t2 = t1 incl 2;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ));$skip(20); 
	val t3 = t2 incl 1;System.out.println("""t3  : week3.IntSet = """ + $show(t3 ));$skip(38); 
	val t4 = new NonEmpty(4,Empty,Empty);System.out.println("""t4  : week3.NonEmpty = """ + $show(t4 ));$skip(22); 
	val t5 = t3 union t4;System.out.println("""t5  : week3.IntSet = """ + $show(t5 ))}
}

abstract class IntSet {
	def incl(x:Int) : IntSet
	def contains(x:Int) : Boolean
	def union(other: IntSet): IntSet
}

object Empty extends IntSet {
   def contains(x:Int): Boolean = false
   def incl(x:Int): IntSet = new NonEmpty(x, Empty, Empty)
   override def toString = "."
   def union(other: IntSet): IntSet = other
}


class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

   def contains(x:Int): Boolean =
   	if (x < elem) left contains x
   	else if (x > elem) right contains x
   	else true
   	
   def incl(x: Int): IntSet =
   	if (x < elem) new NonEmpty(elem, left incl x , right )
   	else if (x > elem) new NonEmpty(elem, left , right incl x)
   	else this
   override def toString = "{" + left + elem + right + "}"
   def union(other: IntSet): IntSet =
     ((left union right) union other) incl elem

}
