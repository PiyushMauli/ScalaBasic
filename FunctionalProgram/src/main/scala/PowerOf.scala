import scala.io.StdIn

object PowerOf {
  def powerOfTable(num:Int)={
    var number=num
    for(i <- 0 to number){
      println("2^"+i+"="+math.pow(2,i))
    }
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("Enter a number between 0 to 30 : ").toInt
    if(number>0 && number<31){
      PowerOf.powerOfTable(number)
    }
  }
}
