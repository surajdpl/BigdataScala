object WeatherTupleExample {
  def main(args: Array[String]): Unit = {

    // Define a tuple that holds basic weather details (immutable, fixed-size, ordered collection)
    val weatherInfo = ("rainy", "heavy", 28)

    // Access tuple elements using 1-based index (.1, .2, .3)
    val weatherType = weatherInfo._1     // First element → "rainy"
    val intensity   = weatherInfo._2     // Second element → "heavy"
    val temperature = weatherInfo._3     // Third element → 28 (Celsius)

    // Displaying extracted values
    println("Weather Condition: " + weatherType)
    println("Rain Intensity: " + intensity)
    println("Temperature: " + temperature + "°C")

    // Tuple unpacking using pattern matching
    val (weatherStatus, rainLevel, temp) = weatherInfo

    // Printing using unpacked variables
    println("\n---Using Tuple Unpacking---")
    println(s"Condition: $weatherStatus, Intensity: $rainLevel, Temp: $temp°C")

    // Use tuple value in condition
    if (temp < 30) {
      println("🧊 Weather is cool, wear something warm.")
    } else {
      println("🔥 It's hot, stay hydrated!")
    }
  }
}
