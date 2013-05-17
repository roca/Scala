package streams

import common._
import streams._

trait Level1 extends GameDef with Solver with StringParserTerrain {
      /* terrain for level 1*/

    val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin

   
  }

object scratch extends Level1{

terrain(Pos(3,1))                                 //> res0: Boolean = true


val n  = neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up)).toSet
                                                  //> n  : scala.collection.immutable.Set[(streams.scratch.Block, List[streams.scr
                                                  //| atch.Move])] = Set((Block(Pos(1,2),Pos(1,3)),List(Right, Left, Up)), (Block(
                                                  //| Pos(2,1),Pos(3,1)),List(Down, Left, Up)))
  
 newNeighborsOnly(
  Set(
    (Block(Pos(1,2),Pos(1,3)), List(Right,Left,Up)),
    (Block(Pos(2,1),Pos(3,1)), List(Down,Left,Up))
  ).toStream,

  Set(Block(Pos(1,2),Pos(1,3)), Block(Pos(1,1),Pos(1,1)))
)                                                 //> res1: Stream[(streams.scratch.Block, List[streams.scratch.Move])] = Stream((
                                                  //| Block(Pos(2,1),Pos(3,1)),List(Down, Left, Up)), ?)
  
}