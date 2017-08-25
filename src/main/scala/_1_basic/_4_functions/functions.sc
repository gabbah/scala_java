object Test {




  case class Person(age: Int)

  def ageSum(persons: Seq[Person], someFunction: Person => Int) = persons.map(someFunction).sum

  val above18 = (p: Person) => if (p.age > 18) p.age else 0

  ageSum(Seq(Person(30)), above18)





}