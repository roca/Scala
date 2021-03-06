package main.scala.rosalind

import scala.io.Source._

/*

In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.

The reverse complement of a DNA string s is the string sc formed by reversing the symbols of s, then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC").

Given: A DNA string s of length at most 1000 bp.

Return: The reverse complement sc of s.

Sample Dataset

AAAACCCGGT
Sample Output

ACCGGGTTTT

*/

object Complement {
  def main(args: Array[String]): Unit = {

  val dna_seq = fromFile(args(0), "utf-8").getLines.mkString
    println(reverse_complement(dna_seq))
  }

  def reverse_complement(dnaSequence: String): String = {

  	val m = Map(
        'a' -> 't',
        'A' -> 'T',
        'c' -> 'g',
        'C' -> 'G',
        't' -> 'a',
        'T' -> 'A',
        'g' -> 'c',
        'G' -> 'C'
    )
     dnaSequence.reverse.map(m)


  }

}
