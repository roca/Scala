class Marker(val color : String) {
  println(s"creating $color marker")
  override def toString = s"Marker with $color"
}

val marker1 = new Marker("Purple")
println(marker1)

object MarkerFactory {
  val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )
  
  def get(color: String) = markers(color)
}

println(MarkerFactory.get("red"))
println(MarkerFactory.get("blue"))
