// To represent a "missing value", scala uses Option.
// null is supported only for interoperability with Java

case class Person(name: String, partner: Option[Person], father: Option[Person], mother: Option[Person])
