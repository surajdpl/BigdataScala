// Define an object (like a class with static methods) named WeatherCheck
object WeatherCheck1 {

  // Main method – Entry point of the Scala program
  def main(args: Array[String]): Unit = {

    val weather = "rainy"        // Declare a string variable 'weather' and assign value "rainy"
    val intensity = "heavy"      // Declare another string variable 'intensity' with value "heavy"

    // Use pattern matching (Scala's version of switch-case) to evaluate the weather condition
    weather match {

      // Case 1: If weather is "rainy"
      case "rainy" =>
        println("☔ Take an umbrella") // Print umbrella message

        // Nested pattern match to evaluate rain intensity
        intensity match {
          case "heavy" => println("🧥 Also wear a raincoat")      // If rain is heavy
          case "light" => println("🌂 Take a small umbrella")     // If rain is light
          case _       => println("🔍 Check weather intensity again") // Default case if intensity is unknown
        }

      // Case 2: If weather is "sunny"
      case "sunny" =>
        println("☀️ Enjoy the sunny weather") // Print sunny weather message

      // Case 3: For all other weather conditions (windy, cloudy, etc.)
      case _ =>
        println("😴 Do nothing, take rest") // Default fallback message
    }
  }
}
