package _1_basic._9_java_interop
import scala.collection.JavaConverters._

import java.util

case class MyScalaClass(names: Seq[String])


object MyScalaClass {
  def apply(names: util.List[String]) = MyScalaClass(names.asScala)
}
