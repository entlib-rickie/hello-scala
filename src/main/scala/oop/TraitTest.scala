package oop
//特质Read
trait Read {
  val readType = "Read"
  val gender = "m"
  def read(name:String){
    println(name+" is reading")
  }
}
//特质Listen
trait Listen {
  val listenType = "Listen"
  val gender = "m"
  def listen(name:String){
    println(name + " is listenning")
  }
}
// 使用extends或with关键字，混入到类中
class Worker() extends Read with Listen{
  override val gender = "f"
}

object Test {
  def main(args: Array[String]): Unit = {
    val worker = new Worker()
    worker.read("Jack")
    worker.listen("Tom")
    println(worker.listenType)
    println(worker.readType)
    println(worker.gender)
  }
}