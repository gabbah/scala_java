object Test {

  // To represent a "missing value", scala uses Option.
  // null is supported only for interoperability with Java

  case class Person(wallet: Option[Wallet]) // using Option in fields is fine, it's serializable
  case class Wallet(licence: Option[License])
  case class License() { def validNow = true }

  def mayDriveCar(person: Person) = person.wallet match {
    case Some(Wallet(Some(license))) => license.validNow
    case _                           => false
  }
  val person = Person(Some(Wallet(Some(License()))))
  mayDriveCar(person)

  // Alternative 2, more like the java version:
  def mayDriveCar2(person: Person): Boolean = person.wallet
    .flatMap(_.licence)
    .exists(_.validNow)

  mayDriveCar2(person)

}