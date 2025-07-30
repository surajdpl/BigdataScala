import scala.io.StdIn._
object take_input_do_operation {
  def main(args: Array[String]): Unit = {


    println("Enter First number")
    val a = scala.io.StdIn.readInt()

    println("Enter second Number")
    val b = readInt()

    println("Enter Operation ( + , - , * , / ) :")
    val op = readLine()

    val result = op match {
      case "+" => a + b
      case "-" => a - b
      case "*" => a * b
      case "/" if b != 0 => a.toDouble / b
      case "/" => "DIVISION by zero error "
      case _ => "Invalid operation"
    }
    println(s"result : $result")
  }
}
