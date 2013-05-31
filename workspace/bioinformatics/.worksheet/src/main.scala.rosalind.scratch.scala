package main.scala.rosalind


import DnaCount._
import main.scala.rosalind.TranscribeDna._
import main.scala.rosalind.Complement._


object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(193); 
    val dna_seq = "GATGGAACTTGACTACGTAAATT";System.out.println("""dna_seq  : String = """ + $show(dna_seq ));$skip(38); val res$0 = 
    
    DnaCount.transcribe(dna_seq);System.out.println("""res0: <error> = """ + $show(res$0))}
}
