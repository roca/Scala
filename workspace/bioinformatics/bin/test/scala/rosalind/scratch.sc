package test.scala.rosalind


import main.scala.rosalind._
import DnaCount._
import TranscribeDna._
import Complement._
import RabbitCount._

object scratch {
    val dna_seq = "GATGGAACTTGACTACGTAAATT"       //> dna_seq  : String = GATGGAACTTGACTACGTAAATT
    
   transcribe(dna_seq)                            //> res0: String = GAUGGAACUUGACUACGUAAAUU
   
   
   fibonacciNumbersUpTo(4).mkString(" ")          //> res1: String = 0 1 1 2
   fibonacciNumbersUpTo(3).mkString(" ")          //> res2: String = 0 1 1
}