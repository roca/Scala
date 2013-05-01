package week6

object pairs {
  val n = 7                                       //> n  : Int = 7
  (1 until n) map (i =>
  (1 until i) map (j => (i, j)))                  //> res0: scala.collection.immutable.IndexedSeq[scala.collection.immutable.Indexe
                                                  //| dSeq[(Int, Int)]] = Vector(Vector(), Vector((2,1)), Vector((3,1), (3,2)), Vec
                                                  //| tor((4,1), (4,2), (4,3)), Vector((5,1), (5,2), (5,3), (5,4)), Vector((6,1), (
                                                  //| 6,2), (6,3), (6,4), (6,5)))
}