object Test {



  // Or use case classes!
  case class ScalaPojo(var age: Int, name: String) // default is public val

  val myScalaPojo = ScalaPojo(2, "Jens")
  val myScalaPojo2 = ScalaPojo(2, "Jens")
  myScalaPojo.equals(myScalaPojo2)
  myScalaPojo.toString
  myScalaPojo.age = 3
  
  
  
}