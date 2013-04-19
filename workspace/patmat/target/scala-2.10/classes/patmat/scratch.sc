package patmat


object scratch {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val list = Huffman.times(List('a', 'b', 'a','c','c','c'))
                                                  //> list  : List[(Char, Int)] = List((a,2), (b,1), (c,3))
  val m = Huffman.makeOrderedLeafList(list)       //> m  : List[patmat.Huffman.Leaf] = List(Leaf(b,1), Leaf(a,2), Leaf(c,3))
}