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

terrain(Pos(3,1));System.out.println("""res0: Boolean = """ + $show(res$0));$skip(80); 



val n  = neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up)).toSet;System.out.println("""n  : scala.collection.immutable.Set[(streams.scratch.Block, List[streams.scratch.Move])] = """ + $show(n ))}
    
  
}
