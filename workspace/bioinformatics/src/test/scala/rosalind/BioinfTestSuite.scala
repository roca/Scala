package test.scala.rosalind


import main.scala.rosalind._
import DnaCount._
import TranscribeDna._
import Complement._
import RabbitCount._


import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BioinfTestSuite extends FunSuite{

  
  test("DnaCount test") {
    val dna_seq = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"
    assert(dnaCount(dna_seq).mkString(" ") == "20 12 17 21")

  }


  test("TranscribeDna test")   {
    val dna_seq = "GATGGAACTTGACTACGTAAATT"
    assert(transcribe(dna_seq) == "GAUGGAACUUGACUACGUAAAUU")

  }


   test("Reverse Complement test") {
      val dna_seq = "AAAACCCGGT"
      assert(reverse_complement(dna_seq) == "ACCGGGTTTT")

    }

}