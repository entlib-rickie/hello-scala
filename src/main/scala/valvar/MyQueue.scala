package valvar

import scala.collection.immutable._
import scala.collection.mutable

object MyQueue {
  def main(args: Array[String]): Unit = {
    val queue = Queue[Int]()
    // 当Queue属于不可变集合包时，对它进行改变内容的操作会返回一个新的对象
    // queue1是新返回的队列对象
    val queue1 = queue.enqueue(1)
    // 当前 Queue 属于不可变集合，所以上一步入队操作其实是模拟操作，queue并没有元素入队
    // 返回的 queue1 是新生成的对象
    println(s"queue: ${queue}")
    println(s"queue1: ${queue1}")

    // 当Queue属于可变集合包时，能在原内容上修改，对它进行改变内容的操作不会返回新的对象
    // queue3是Unit类型的空值，说明没有返回新的对象
    val queue2=new mutable.Queue[Int]()
    val queue3=queue2.enqueue(10)
    println(s"queue2: ${queue2}")
    println(s"queue3: ${queue3}")

    // 测试var 和 val 的区别
    var queue5 = Queue[Int]()
    // 把 queue5 指向的地址改为指向 queue1。如果使用 val 声明 queue5，那么这个修改就不能完成
    queue5 = queue1
    // 因为 queue5 指向为不可变集合，所以这一步不能修改到原内容的值
    val queue6 = queue5.enqueue(5)
    println(s"queue5: ${queue5}")
    println(s"queue1: ${queue1}")
    println(s"queue6: ${queue6}")
  }
}
