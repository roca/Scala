package week6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(57); val res$0 = 
  (1 until n) map (i =>
  (1 until i) map (j => (i, j)));System.out.println("""res0: scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(res$0))}
}
