object SingletonObjectTest {
  private var lastId=0
  def newId() = {
    lastId+=1
    lastId
  }
}
