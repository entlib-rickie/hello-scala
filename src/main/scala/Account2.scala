class Account2(val id:Int,var balance:Double) {
  def deposit(amount:Double): Unit = {
    balance += amount
  }
  def info(): Unit = {
    println(s"$id,$balance")
  }
}

//伴生对象
object Account2 {
  private var lastNumber = 0
  def newUniqueNumber()={
    lastNumber+=1
    lastNumber
  }
  def apply(initializeBalance:Double)=new Account2(newUniqueNumber(), initializeBalance)
  def unapply(account:Account2):Option[(Int,Double)]={
    if(account==null){
      None
    } else {
      Some((account.id, account.balance))
    }
  }
}
