
case class Stone(volume: Double, weight: Double, color: String, rockType: String, minerals: Seq[String])

object test4 {
	val aStone = Stone(10, 5,"grey", "granite", Seq("iron", "zink"))
	val copyModified = aStone.copy(rockType = "slate")
}