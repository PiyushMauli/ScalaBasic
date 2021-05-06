import scala.io.StdIn
import scala.util.control.Breaks._

object FactorsNumber {
  def primeFactorization(num:Int)={
    var number=num
    var str:String=""
    var flag=true
    while(flag){
      breakable{
        for(i<- 2 to number/2){
          if(number%i==0){
            str+=i+"X"
            number=number/i
            break
          }
        }
        flag=false
      }
    }

    str+=number
    println(str)
  }
  def main(args: Array[String]): Unit = {
    var number=StdIn.readLine("Enter a number").toInt;
    var flag=0
    for (i <- 2 to number/2){
      if(number%i==0) {
        flag = 1
      }
    }
    if(flag==0){
      println("prime factorization is : "+number)
    }else{
      primeFactorization(number)
    }
  }
}
