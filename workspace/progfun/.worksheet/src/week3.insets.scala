package week3

object insets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
	val t1 = new NonEmpty(3,Empty,Empty);System.out.println("""t1  : week3.NonEmpty = """ + $show(t1 ));$skip(20); 
	val t2 = t1 incl 2;System.out.println("""t2  : week3.IntSet = """ + $show(t2 ));$skip(20); 
	val t3 = t2 incl 1;System.out.println("""t3  : week3.IntSet = """ + $show(t3 ));$skip(38); 
	val t4 = new NonEmpty(4,Empty,Empty);System.out.println("""t4  : week3.NonEmpty = """ + $show(t4 ));$skip(22); 
	val t5 = t3 union t4;System.out.println("""t5  : week3.IntSet = """ + $show(t5 ))}
}
