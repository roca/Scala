val memo = """This runs
  multiple lines"""

println(memo)

val memo2 = """This runs
  |multiple lines""".stripMargin

println(memo2)
//if code indentation requires string 
//indentation, stripMargin can help