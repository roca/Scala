class Marker private(val color : String) {
  println(s"creating $color marker")
  override def toString = s"Marker with $color"
}

//val marker1 = new Marker("Purple") //nope
//println(marker1)

object Marker {
  val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )
  
  def get(color: String) = markers(color)
}

println(Marker.get("red"))
println(Marker.get("blue"))
