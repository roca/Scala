package funsets

import common._

/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = {
    def f(x: Int): Boolean = {
      x == elem
    }
    f
  }
  

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = {
    def f(x : Int): Boolean = {
      contains(s, x) || contains(t,x)
    }
    f
  }

  /**
   * Creates a mutli element set containing 
   * natural numbers from start to end by some increment function.
   * Uses the mapReduce function shown in the video
   */
  def multiElement(start:Int, end: Int, increment: Int => Int): Set ={
	  def mapReduce(f: Int => Set,combine: (Set,Set) => Set, zero: Set)(a: Int, b: Int): Set= {
	  	if (a > b) zero
	  	else combine( f(a) , mapReduce(f,combine,zero) (increment(a),b) )
  	}
  	 mapReduce(singletonSet,union,x => false )(start, end)
  }

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = {
    def f(x : Int): Boolean = {
      contains(s, x) && contains(t,x)
    }
    f
  }

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = {
    def f(x : Int): Boolean = {
      contains(s, x) && !contains(t,x)
    }
    f
  }
  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = intersect(s,p)

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000

  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) true
      else if (contains(s,a) && !p(a)) false
      else iter( a + 1)
    }
    iter(-1000)
  }

  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = forall(p,s)

  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = {
    
    def iter(a: Int, acc: Set): Set = {
      if (a > bound) acc
      else if (contains(s,a)) iter(a+1, union(singletonSet(f(a)),acc))
      else iter( a + 1, acc)
    }
    iter(-1000, x => false)
  }

  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }
}
