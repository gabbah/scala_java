class Pojo(var age: Int, val name: String) { // val makes it immutable, public is default for everything in the class 
  def canEqual(a: Any) = a.isInstanceOf[Pojo]

  override def equals(that: Any): Boolean =
    that match {
      case that: Pojo => that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
    }

  override def hashCode: Int = {
    val prime = 31
    var result = 1
    result = prime * result + age;
    result = prime * result + (if (name == null) 0 else name.hashCode)
    return result
  }

  override def toString: String = "Pojo{" + "age=" + age + ", name='" + name + '\'' + '}';
}

val pojo = new Pojo(2, "Jens")
val pojo2 = new Pojo(2, "Jens")
pojo.equals(pojo2)
pojo.toString

// access class fields
pojo.name
// modify fields
pojo.age = 3



