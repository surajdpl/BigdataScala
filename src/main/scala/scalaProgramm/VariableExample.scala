package scalaProgramm

object VariableExample {
  def main(args: Array[String]): Unit = {

    // Immutable variable (like final)
    val name: String = "Shakti"

    // Mutable variable
    var age: Int = 25

    // Print the variables
    println("Name: " + name)
    println("Age: " + age)
  }
}