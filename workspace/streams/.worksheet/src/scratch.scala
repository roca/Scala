import streams.StringParserTerrain._
import streams.GameDef._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
val v = Vector(1,2);System.out.println("""v  : scala.collection.immutable.Vector[Int] = """ + $show(v ));$skip(9); val res$0 = 
v.length;System.out.println("""res0: Int = """ + $show(res$0));$skip(28); 

val x = terrain(Pos(4,11));System.out.println("""x  : <error> = """ + $show(x ))}
}
