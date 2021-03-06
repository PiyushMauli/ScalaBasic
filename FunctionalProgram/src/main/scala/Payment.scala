class PaymentCheck(var principal:Double,var years:Double,var rate:Double){
  def monthlyPayment()={
    val r: Double = (rate / (12*100))  // monthly interest rate
    val n: Double = 12 * years // number of months

    val payment: Double = (principal * r) / (1 - Math.pow(1 + r, -(n)))
    payment
  }
}

object Payment {
  def main(args: Array[String]): Unit = {
  val principal: Double = args(0).toDouble
    val years: Double = args(1).toDouble
    val rate: Double = args(2).toDouble

    var paymentCheck=new PaymentCheck(principal,years,rate)
    println(paymentCheck.monthlyPayment())

  }
}
