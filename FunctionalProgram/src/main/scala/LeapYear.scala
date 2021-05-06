import scala.io.StdIn

object LeapYear {
  def checkLeapYear(num:Int)={
    if(num % 100 ==0){
      if(num % 4 ==0 && num %400==0){
        println("Leap Year")
      }else{
        println("Not a leap year")
      }
    }else if(num % 4==0){
      println("leap year")
    }
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("Enter a year : ")
    if(number.length > 3){
      checkLeapYear(number.toInt)
    }
  }
}
