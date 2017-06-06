// given two lists of numbers: 
// - if both lists are non-empty, print the sum of both lists elements.
// - if either list is empty, print the second element of the other list (if it exists).
// if boths lists are empty, print "both empty"

// alternative 1
def printInfo(a: Seq[Int], b: Seq[Int]) = (a, b) match {
    case (Nil, Nil)                => println("both empty")
    case (Nil, e1 :: e2 :: Nil)    => println(e2)
    case (e1 :: e2 :: Nil, Nil)    => println(e2)
    case _                         => println((a ++ b).sum)
}

// alternative 2
def printInfo2(a: Seq[Int], b: Seq[Int]) = (a, b) match {
    case (Nil, Nil)                => println("both empty")
    case (Nil, b) if b.size > 1    => println(b(1))
    case (a, Nil) if a.size > 1    => println(a(1))
    case _                         => println((a++b).sum)
}


printInfo(Seq(1,3), Seq(5,7))
printInfo(Seq.empty, Seq(5,7))
printInfo(Seq(1,3), Seq.empty)
printInfo(Seq.empty, Seq.empty)
