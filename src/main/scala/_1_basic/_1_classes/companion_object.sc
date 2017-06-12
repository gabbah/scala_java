class Pojo{
   def incr: Int = {Pojo.sharedCount += 1; Pojo.sharedCount}  // += returns Unit (void) :(
   // singleton with same name as class is a companion object: private members are accessible
}

// companion object
// "singleton"
object Pojo {
   private var sharedCount: Int = 0 // may not be implicitly null (but explicitly works, for interop with Java)
}



val myPojoInstance = new Pojo
myPojoInstance.incr
myPojoInstance.incr
myPojoInstance.incr

