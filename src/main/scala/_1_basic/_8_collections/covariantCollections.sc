class Animal { def shave = this }
case class Cow() extends Animal

def processAnimals(animals: Seq[Animal]): Seq[Animal] = animals.map(_.shave)

val cows = Seq.fill(3)(Cow.apply())

processAnimals(cows)  // Works since Seq[Cow] is a subtype of Seq[Animal] !
