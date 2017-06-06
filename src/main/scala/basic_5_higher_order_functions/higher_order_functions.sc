case class Person(age: Int)

def sumAdultPersonAges(persons: Seq[Person], adultCalculator: Person => Boolean) = persons.filter(adultCalculator).map(_.age).sum

val isAdultCalculator = (p: Person) => p.age >= 18

val persons = Seq.empty
sumAdultPersonAges(persons, isAdultCalculator)
