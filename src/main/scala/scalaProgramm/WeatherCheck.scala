package scalaProgramm

object WeatherCheck {
  def main(args: Array[String]): Unit = {

    val weather = "a"        // Current weather condition
    val intensity = "low"      // Intensity of the weather

    // Match-case for weather evaluation
    weather match {
      case "rainy" =>
        println("☔ Take an umbrella")
        intensity match {
          case "heavy" => println("🧥 Also wear a raincoat")
          case "light" => println("🌂 Take a small umbrella")
          case _       => println("🔍 Check weather intensity again")
        }

      case "sunny" =>
        println("☀️ Enjoy the sunny weather")

      case _ =>
        println("😴 Do nothing, take rest")
    }
  }
}
