val langs = Map(
  "Java" -> "Gosling",
  "Ruby" -> "Matz",
  "Scala" -> "Odersky"
)

def createLangs() = {
  langs.map {entry => 
    val (k, v) = entry
    <language name={k}>{v}</language>
  }
}

val languages = <languages>{ createLangs() }</languages>

println(languages)
