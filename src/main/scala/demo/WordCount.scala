package demo
// 导入需要的类
import java.io.File
import java.net.URL
import scala.io.Source
import scala.collection.mutable.Map
// 创建单例对象Singleton Object
object WordCount {
  // main方法是程序执行入口
  def main(args: Array[String]): Unit = {
    // 获取resource目录
    val resource: URL = this.getClass.getClassLoader.getResource("")
    // 拼接testfiles子目录，该目录下存放文本文件
    // 注意：在windows环境下，需要将路径前的'file:/'去掉,否则无法读取到文件
    val filePath = (resource.toString + "testfiles").substring(5)
    // 输出完整路径，方便调试
    println(filePath)
    val dirFile = new File(filePath)
    // 获取所有文件对象构成的数组
    val files = dirFile.listFiles
    // 建立可变的、空的Map对象results，用来保存统计结果
    val results = Map.empty[String, Int]
    // 如果没有文件对象，直接返回
    if(files == null) return
    // 对文件对象进行循环
    for(file<-files) {
      // 从File 对象建立Source对象，方便文件的读取
      val data = Source.fromFile(file)
      // getLines方法返回文件各行构成的迭代器对象，类型为 Iterator[String]
      // flatMap 进一步将每一行字符串拆分成单词，再返回所有这些单词构成的新字符串迭代器
      val strs = data.getLines().flatMap(line=>line.split(" "))
        .map(removePunctuation).filter(_!="")
      // 进行遍历，在匿名函数中，对应当前遍历的某个单词，
      // 如果之前统计过，就+1,；如果没有统计过，则创建一个新的Map条目，并赋值为1。
      strs foreach {
        word=>
          if(results.contains(word))
            results(word) += 1
          else
            results(word) = 1
      }
    }
    // 输出统计结果
    // results foreach {case (k,v) => println(s"$k:$v")}
    results.toList.sortBy(_._2).reverse foreach {case (k,v) => println(s"$k:$v")}
  }

  // 移除标点符号，转换为小写字符
  val removePunctuation: String => String = (text: String) => {
    val punctPattern = "[^a-zA-Z0-9\\s]".r
    punctPattern.replaceAllIn(text, "").toLowerCase
  }
}
