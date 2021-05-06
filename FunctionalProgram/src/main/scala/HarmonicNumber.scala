import scala.io.StdIn

object HarmonicNumber {
  def calHarmonic(num:Int)={
    var sum:Double=0.0
    for(i <- 1 to num){
      sum+=(1f/i)
      println(sum)
    }
    println(sum)
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("Enter a number greater than 0 : ").toInt
    if(number>0){
      calHarmonic(number)
    }
  }
}
