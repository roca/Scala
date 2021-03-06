import week3.NonEmpty
import week3.Empty

object insets {
	val t1 = new NonEmpty(3,Empty,Empty)      //> t1  : week3.NonEmpty = {.3.}
	val t2 = t1 incl 2                        //> t2  : week3.IntSet = {{.2.}3.}
	val t3 = t2 incl 1                        //> t3  : week3.IntSet = {{{.1.}2.}3.}
	val t4 = new NonEmpty(4,Empty,Empty)      //> t4  : week3.NonEmpty = {.4.}
	val t5 = t3 union t4                      //> t5  : week3.IntSet = {{{.1.}2{.3.}}4.}
}