object Hello extends App {
  //println("Hello, World.")

  import util.control.Breaks._
  val array=Array(9,8,1,7,6,5,1,2,3,4)
  breakable{
    for(i<-array){
      if(i<5) break
      println("i="+i)
    }
  }
}
