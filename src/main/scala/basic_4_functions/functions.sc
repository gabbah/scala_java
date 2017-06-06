case class Person(age: Int)

def ageSum(persons: Seq[Person], someFunction: Person => Int) = {}

val above18 = (p: Person) => if (p.age > 18) p.age else 0 

