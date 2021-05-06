import scala.::
import scala.io.StdIn
import scala.util.Random

object CouponNumbers {
  def generateRandomCoupon(number:Int)={
    val couponList=new Array[Int](number)
    var index=0
    var num:Int=number
    var count=0
    while(num>0){
      count=count+1
      var randomeNumber=new Random().nextInt(10)
      if(!couponList.contains(randomeNumber)){
        couponList(index)=randomeNumber
        num=num-1
        index=index+1
      }
    }
    for(couponNum <- couponList){
      print(couponNum+" ")
    }
    println()
    println("random counr"+count)
  }
  def main(args: Array[String]): Unit = {
    val number=StdIn.readLine("How many random numbers do you want to generate ?? : ").toInt
    CouponNumbers.generateRandomCoupon(number)
  }
}
