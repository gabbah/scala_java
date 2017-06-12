import java.time.LocalDate

trait Mammal{ val age: Int}
case class Dog(lastVaccination: LocalDate, age: Int) extends Mammal
case class Human(name: String, age: Int) extends Mammal

def printInfo(mammal: Mammal) = mammal match {
  case d: Dog   => println(d.lastVaccination)
  case h: Human => println(h.name)
}

printInfo(Dog(LocalDate.now, 8))
printInfo(Human("Jens", 40))
