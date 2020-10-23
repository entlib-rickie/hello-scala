class Counter {
  //私有变量，外界无法直接访问
  private var privateValue:Int = 0
  private var name:String = _

  //定义一个方法，方法名为我们想要的字段的名称，代替getter
  def value= privateValue

  // value_方法名字
  def value_=(newValue:Int) {
    privateValue = newValue
  }

  def increment(step:Int):Unit={
    value += step
  }
}
//注意，scala中默认方法是public的
object MyCounter{
  def main(args: Array[String]){
    val myCounter = new Counter
    //调用value方法访问value，相当于getter
    println(myCounter.value)
    //为value设置新值，相当于setter
    myCounter.value = 3
    // 调用increment方法
    myCounter.increment(100)
    println(myCounter.value)
  }
}