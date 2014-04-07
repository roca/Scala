package week6

object books {
 
 case class Book(title: String, authors: List[String]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(650); 
 
val books = Set(
Book(title = "Structure and Interpretation of Computer Programs",
authors = List("Abelson, Harald", "Sussman, Gerald J.")),
Book(title = "Introduction to Functional Programming",
authors = List("Bird, Richard", "Wadler, Phil")),
Book(title = "Effective Java",
authors = List("Bloch, Joshua")),
Book(title = "Effective Java 2",
authors = List("Bloch, Joshua")),
Book(title = "Java Puzzlers",
authors = List("Bloch, Joshua", "Gafter, Neal")),
Book(title = "Programming in Scala",
authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")));System.out.println("""books  : scala.collection.immutable.Set[week6.books.Book] = """ + $show(books ));$skip(73); val res$0 = 

 for( b <- books ; a <- b.authors if a startsWith "Bird") yield b.title;System.out.println("""res0: scala.collection.immutable.Set[String] = """ + $show(res$0));$skip(83); val res$1 = 
 books.filter( x => x.authors.exists(y => y startsWith "Bird")).map( z => z.title);System.out.println("""res1: scala.collection.immutable.Set[String] = """ + $show(res$1));$skip(71); val res$2 = 
 
  for( b <- books  if b.title.indexOf("Program") >= 0) yield b.title;System.out.println("""res2: scala.collection.immutable.Set[String] = """ + $show(res$2));$skip(135); 


	val a = for {
		b1 <- books ;b2 <- books
		if b1.title < b2.title
				a1 <- b1.authors; a2 <- b2.authors
		if a1 == a2
		} yield a1;System.out.println("""a  : scala.collection.immutable.Set[String] = """ + $show(a ))}
		

}
