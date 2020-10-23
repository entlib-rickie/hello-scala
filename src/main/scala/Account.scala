class Account {
  // 调用了伴生对象中的方法
  private val id = Account.newUniqueNumber()
  private var balance = 0.0;
  def deposit(amount:Double): Unit = {
    balance += amount
  }
  def info(): Unit = {
    println(id)
  }
}

//伴生对象
object Account {
  private var lastNumber = 0
  def newUniqueNumber()={
    lastNumber+=1
    lastNumber
  }
}
