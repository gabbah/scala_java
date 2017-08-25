object Test {



  import scala.util.Random

  val list = Seq.fill(8)(Random.alphanumeric.take(3).mkString)

  // map
  def prepended(list: Seq[String], prefix: String) = list.map(prefix + _)
  prepended(list, "000")



}