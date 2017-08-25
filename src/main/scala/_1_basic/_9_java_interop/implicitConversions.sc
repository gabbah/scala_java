object Test {


  import _1_basic._9_java_interop.ExplicitConversions

  // implicit conversions are deprecated, use explicit (safer/clearer code)
  import scala.collection.JavaConversions._
  val javaClass = new ExplicitConversions(Seq("Mats"))
                       
                                                  

}