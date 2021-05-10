import scala.io.StdIn

class TempratureCheck(var degreeCelsius:Int=50,var degreeFahrenhit:Int=50){
  def temperaturConversionCelsius()={
    (degreeCelsius * 9/5) + 32
  }
  def temperaturConversionFahrenhit()={
    (degreeFahrenhit - 32) * 5/9
  }
}
object Temprature {
  def main(args: Array[String]): Unit = {
    var celsius=StdIn.readLine("Enter value to convert degreeCelsius to degreeFahrenhit").toInt
    var fahrenhit=StdIn.readLine("Enter value to convert degreeFahrenhit to degreeCelsius").toInt

    var tempratureCheck=new TempratureCheck(celsius,fahrenhit)
    println(tempratureCheck.temperaturConversionCelsius())
    println(tempratureCheck.temperaturConversionFahrenhit())

  }
}
