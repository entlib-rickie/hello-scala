package implicitconversion

import scala.collection.immutable.StringOps

object ImplicitTest {
  def plus(a:Int, b:Int)={
    a+b
  }

  implicit def str2Int(x:String):Int = new StringOps(x).toInt

  def main(args: Array[String]): Unit = {
    println(plus(1,2))
    println(plus("1","2"))
  }
}

