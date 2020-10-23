package pkgtest

package object Math{
  val PI=3.141529
  val SIGMA=1.9
}

class Circle {
  def computeArea(r:Double)=pkgtest.Math.PI*r*r
}

object Test {
  def main(args: Array[String]): Unit = {
    val area = new Circle()
    var result:Double = area.computeArea(10)
    println(result)
  }
}
