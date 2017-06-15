import java.awt.Color

case class Eye(color: Color, correction: Double)
case class Eyes(left: Eye, right: Eye)
case class NearSightedPerson(name: String, eyes: Eyes)

def doLeft(color: Color, correction: Double) = ???  
def doRight(color: Color, correction: Double) = ??? 
def doOther = ???


def treatPerson(p: NearSightedPerson): Unit = p match {
  case NearSightedPerson(_, Eyes(Eye(color, correctionLeft), Eye(_, 0))) => doLeft(color, correctionLeft)
  case NearSightedPerson(_, Eyes(Eye(_, 0), Eye(color, correctionRight))) => doRight(color, correctionRight)
  case _ => doOther
}
