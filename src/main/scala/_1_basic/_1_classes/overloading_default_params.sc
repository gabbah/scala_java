object Test2 {




  class Dog(breed: String, legsCount: Int = 4, hasTail: Boolean = true) {

    override def toString: String = s"Dog($breed, $legsCount, $hasTail)" // just so we can see instance properties
  }

  new Dog("Pitbull")
  new Dog("Pitbull", hasTail = false)
  new Dog("Pitbull", legsCount = 3)
  new Dog("Pitbull", legsCount = 3, hasTail = false)






}