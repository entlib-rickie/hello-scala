package matchtest

object Test {
  def main(args: Array[String]) {
    println(matchTest(1))
    println(matchTest(3))
  }
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}
