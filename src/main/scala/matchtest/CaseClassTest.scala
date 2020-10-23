package matchtest

object CaseClassTest {
  def main(args: Array[String]) {
    val alice = Person("Alice", 25)
    val bob = Person("Bob", 32)
    val charlie = Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) =>
          println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }
  // 样例类
  case class Person(name: String, age: Int)
}
