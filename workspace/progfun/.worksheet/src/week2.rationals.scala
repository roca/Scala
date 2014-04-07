package week2

import week3.Rational

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(13); val res$0 = 
  
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(31); 
  
  val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(31); 
  
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(11); val res$2 = 
  
  x + y;System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(12); val res$3 = 
  x - y - z;System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y + y;System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(8); val res$5 = 
  x < y;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(10); val res$6 = 
  x max y;System.out.println("""res6: week3.Rational = """ + $show(res$6));$skip(10); val res$7 = 
  x min y;System.out.println("""res7: week3.Rational = """ + $show(res$7));$skip(29); 
  
  val t = new Rational(2);System.out.println("""t  : week3.Rational = """ + $show(t ))}
 


 }
