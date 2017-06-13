// To represent a "missing value", scala uses Option.
// null is supported only for interoperability with Java

case class Person(forename: String, surname: String, partner: Option[Person]) {
  def isMarried = partner match {
    case Some(p)  => p.surname == surname
    case None     => false
  }
}
