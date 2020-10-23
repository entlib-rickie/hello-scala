package applymethod

object Book {
  def main(args: Array[String]): Unit = {
    // Creating a map
    val bookMap = Map("Scala"->10, "Flink"->20, "Elasticsearch"->30)
    // Applying apply method
    val result1 = bookMap.apply("Scala") //根据键查找值
    val result2 = bookMap("Scala") // 实际上调用map对象的apply方法
    // Display output
    println(s"$result1 --> $result2")
  }
}
