package oop

abstract class Person(val name:String) {
  //具体属性
  var age=0
  //抽象方法
  def info()
  //具体方法
  def speak(): Unit = {
    println(s"Hello $name")
  }
}

class Student(override val name: String) extends Person(name){
  override def info()={
    println(s"Info: $name")
  }
}

object StudentObj {
  def main(args: Array[String]): Unit = {
    val std1=new Student("Jack")
    val std2=new Student("Tom")
    std1.info()
    std2.info()
  }
}
