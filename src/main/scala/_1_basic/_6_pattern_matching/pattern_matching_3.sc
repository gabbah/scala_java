import java.awt.Color

case class Eye(color: Color, correction: Double)
case class Eyes(left: Eye, right: Eye)
case class NearSightedPerson(name: String, eyes: Eyes)

def getLeftMonocle(correction: Double) = ???  // get monocle for left eye
def getRightMonocle(correction: Double) = ??? // get monocle for right eye


case class Monocle()

// bad example, change it!

def monocleForPerson(p: NearSightedPerson): Monocle = p match {
  case NearSightedPerson(_, Eyes(Eye(_, correctionLeft), Eye(_, 0))) => getLeftMonocle(correctionLeft)
  case NearSightedPerson(_, Eyes(Eye(_, 0), Eye(_, correctionRight))) => getRightMonocle(correctionRight)
}
