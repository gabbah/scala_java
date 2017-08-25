object Test {

  import scala.collection.immutable
  // immutable collections is default

  val numbers = Seq(1, 2, 3, 4, 5)
  val emptyList = Nil

  val addOne = 1 +: emptyList

  val map = Map("a" -> 1, "b" -> 2)
  val map2 = Map("a" -> 3, "c" -> 4)

  val mapAddition = map ++ map2
  val removedKeys = map -- map2.keys

  val asList = map.toList :+ ("a", 1)
  val set = asList.toSet

  // mutabable collections must be imported
  import scala.collection.mutable
  var mSeq = mutable.Buffer(3)
  val a = mSeq -= 3 // copy with element added
  var b = mSeq += 2 // copy with element added
  mSeq
  mSeq.append(5, 6, 7)
  mSeq

  // tuples
  val tuple = (3, "a")
  val tuple3 = (3, "a", 1)

  tuple._1

}