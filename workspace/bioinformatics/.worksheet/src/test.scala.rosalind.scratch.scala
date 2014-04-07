package test.scala.rosalind


import main.scala.rosalind._
import DnaCount._
import TranscribeDna._
import Complement._
import RabbitCount._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(202); 
    val dna_seq = "GATGGAACTTGACTACGTAAATT";System.out.println("""dna_seq  : String = """ + $show(dna_seq ));$skip(28); val res$0 = 
    
   transcribe(dna_seq);System.out.println("""res0: String = """ + $show(res$0));$skip(49); val res$1 = 
   
   
   fibonacciNumbersUpTo(4).mkString(" ");System.out.println("""res1: String = """ + $show(res$1));$skip(41); val res$2 = 
   fibonacciNumbersUpTo(3).mkString(" ");System.out.println("""res2: String = """ + $show(res$2))}
}
