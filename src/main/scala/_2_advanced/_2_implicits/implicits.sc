object Test {





  // Let's say we have a class which we cannot (or don't want to) modify,
  // and we want to add some functionality to it...
  // Let's say we want to be able capitalize and trim a persons full name, so from
  // "  gabriel   klappenbach " to "Gabriel Klappenbach"

  implicit class NameCleaner(string: String) {
    def clean = {
      val splitOnWhiteSpace = string.trim.split("\\s+")
      splitOnWhiteSpace.map(_.capitalize).mkString(" ")
    }
  }

  "  gabriel   klappenbach".clean
  
  
  
  
  
  
}