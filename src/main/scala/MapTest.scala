object MapTest {
  def main(args: Array[String]) {
    val names = Map("ali" -> "Jack Ma",
      "microsoft" -> "Bill Gates",
      "baidu" -> "Mr. Li")

    val nums: Map[Int, Int] = Map()

    println( "names 中的键为 : " + names.keys )
    println( "names 中的值为 : " + names.values )
    println( "names(\"ali\") : " + names("ali"))
    println( "检测 names 是否为空 : " + names.isEmpty )
    println( "检测 nums 是否为空 : " + nums.isEmpty )
  }
}