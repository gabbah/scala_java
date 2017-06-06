
case class Stone(volume: Double, weight: Double, color: String, rockType: String, minerals: Seq[String]) {
  def addingMineral(mineral: String) = this.copy(minerals = this.minerals :+ mineral)
}

val aStone = Stone(10, 5,"grey", "granite", Seq("iron", "zink"))
val copyModified = aStone.copy(rockType = "slate")
val copyModified2 = aStone.copy(minerals = Seq("iron"))
val copyModified3 = aStone.addingMineral("magnesium")
