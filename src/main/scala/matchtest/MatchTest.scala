package matchtest

object MatchTest {
  def main(args: Array[String]): Unit = {
    val tuple = Tuple6(1,2,3f,4,"hello",5d)
    val tupleIterator = tuple.productIterator
    while(tupleIterator.hasNext){
      matchTest(tupleIterator.next())
    }
  }
  /**
   * 注意点：
   * 1.模式匹配不仅可以匹配值，还可以匹配类型
   * 2.模式匹配中，从上到下顺序匹配，如果匹配到对应的类型或值，就不再继续往下匹配
   * 3.模式匹配中，都匹配不上时，会匹配到 case _，相当于default
   * 4. 模式匹配的时候，模式范围小的在最前面
   */
  def matchTest(x:Any) ={
    x match {
      //类型匹配，必须要有变量名
      case x:Int=> println("type is Int")
      case 1 => println("result is 1")
      case 2 => println("result is 2")
      case 3=> println("result is 3")
      case 4 => println("result is 4")
      case x:String => println("type is String")
      // case x:Double => println("type is Double")
      case _ => println("no match")
    }
  }
}