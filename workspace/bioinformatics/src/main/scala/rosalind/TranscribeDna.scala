package main.scala.rosalind

import scala.io.Source._

/*

An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.

Given a DNA string t corresponding to a coding strand, its transcribed RNA string u is formed by replacing all occurrences of 'T' in t with 'U' in u.

Given: A DNA string t having length at most 1000 nt.

Return: The transcribed RNA string of t.

Sample Dataset

GATGGAACTTGACTACGTAAATT
Sample Output

GAUGGAACUUGACUACGUAAAUU

*/

object TranscribeDna {
  def main(args: Array[String]): Unit = {

  val dna_seq = fromFile(args(0), "utf-8").getLines.mkString
    println(transcribe(dna_seq))
  }

  def transcribe(dnaSequence: String): String = {
  	val m = Map(
        'a' -> 'a',
        'A' -> 'A',
        'c' -> 'c',
        'C' -> 'C',
        't' -> 'u',
        'T' -> 'U',
        'g' -> 'g',
        'G' -> 'G'
    )

    dnaSequence.map(m)


  }

}
