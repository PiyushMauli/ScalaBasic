import scala.io.StdIn

class BinaryCheck(var num:Int){
  def generateBinaryNumber()={
    var str=""

    while(num > 0){
      str=str+(num%2)
      if(str.length%4 == 0){
        str=str+" "
      }
      num=num/2
    }
    str.reverse
  }
}
object Binary {
  def main(args: Array[String]): Unit = {
    val num=StdIn.readLine("Enter a value to generate binary number : ").toInt
    val binaryCheck=new BinaryCheck(num)
    println(binaryCheck.generateBinaryNumber())
  }
}
//110 1010
//10 1100
