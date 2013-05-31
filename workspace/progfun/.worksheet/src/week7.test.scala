package week7

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  val problem = new Pouring(Vector(4,9,19));System.out.println("""problem  : week7.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with week7.test.problem.Move] = """ + $show(res$0));$skip(23); val res$1 = 
 problem.solutions(17);System.out.println("""res1: Stream[week7.test.problem.Path] = """ + $show(res$1));$skip(33); 
  
  val dnaSequence = "AAAAAAA";System.out.println("""dnaSequence  : String = """ + $show(dnaSequence ));$skip(21); 
  val codes = "ACGT";System.out.println("""codes  : String = """ + $show(codes ));$skip(106); 

  	val answer = for {
  		c <- codes
  		count = dnaSequence.count(n => n.toUpper == c)
  	} yield count;System.out.println("""answer  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(answer ));$skip(19); val res$2 = 
  
  answer.toList;System.out.println("""res2: List[Int] = """ + $show(res$2))}
}
