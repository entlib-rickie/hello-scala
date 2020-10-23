// 声明一个类Student
class Student(var name:String, var age:Int) {
  private var province:String=_

  println("Constructing oop.oop.Student ...")
  // 重写toString()方法
  override def toString()=name+":"+age

  def this(name: String) {
    this(name, 10)
    this.name=name
    println(s"this first auxiliary constructor, name:$name")
  }
}