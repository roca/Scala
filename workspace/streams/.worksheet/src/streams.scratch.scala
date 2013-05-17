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

object scratch extends Level1{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(349); val res$0 = 

terrain(Pos(3,1));System.out.println("""res0: Boolean = """ + $show(res$0));$skip(79); 


val n  = neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up)).toSet;System.out.println("""n  : scala.collection.immutable.Set[(streams.scratch.Block, List[streams.scratch.Move])] = """ + $show(n ));$skip(208); val res$1 = 
  
 newNeighborsOnly(
  Set(
    (Block(Pos(1,2),Pos(1,3)), List(Right,Left,Up)),
    (Block(Pos(2,1),Pos(3,1)), List(Down,Left,Up))
  ).toStream,

  Set(Block(Pos(1,2),Pos(1,3)), Block(Pos(1,1),Pos(1,1)))
);System.out.println("""res1: Stream[(streams.scratch.Block, List[streams.scratch.Move])] = """ + $show(res$1));$skip(68); 
 
 
 val paths = from(Stream((startBlock, List())),Set(startBlock));System.out.println("""paths  : Stream[(streams.scratch.Block, List[streams.scratch.Move])] = """ + $show(paths ));$skip(23); val res$2 = 
 paths.take(10).toList;System.out.println("""res2: List[(streams.scratch.Block, List[streams.scratch.Move])] = """ + $show(res$2))}
}
