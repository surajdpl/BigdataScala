import scala.language.postfixOps

// Define a singleton object named 'loop'
object loop {

  // Define the main method, the entry point of Scala application
  def main(args: Array[String]): Unit = {

    // Declare and initialize variable 'sum' to 0 (to store result of first loop)
    var sum = 0

    // Declare and initialize variable 'sum2' to 0 (to store result of second loop)
    var sum2 = 0

    // 'for' loop with 'until' keyword: iterates from 1 up to 4 (5 is excluded)
    for (i <- 1 until 5) {
      sum = sum + i   // Add current value of 'i' to 'sum'
      println(s"sum :  $sum")
    }

    // Print the result of first loop. Tuple-style print, shows label and value
    println("sum of number is : ", sum)  // Output: (sum of number is : , 10)

    // 'for' loop with 'to' keyword: iterates from 1 to 5 (5 is included)
    for (i <- 1 to 5) {
      sum2 = sum2 + i   // Add current value of 'i' to 'sum2'
    }

    // Print the result of second loop. Again, tuple-style output
    println("sum of number is : ", sum2) // Output: (sum of number is : , 15)
  }
}
