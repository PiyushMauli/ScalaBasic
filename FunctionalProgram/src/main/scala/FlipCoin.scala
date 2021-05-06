import scala.io.StdIn
import scala.util.Random

object FlipCoin {
  def findPercentage(num:Int)={
    var heads:Double=0.0
    var tails:Double=0.0
    var flipCoinNumbers=num
    while(flipCoinNumbers != 0){
      val randomValue=new Random().nextDouble()
      if(randomValue < 0.5) tails+=1 else heads+=1
      flipCoinNumbers-=1
    }
    println("Heads % = "+(heads/num)*100+" & Tails % ="+(tails/num)*100)
  }
  def main(args: Array[String]): Unit = {
    val  number= StdIn.readLine("How many times you want to flip the coin ??")
    if(number.toInt > 0){
      FlipCoin.findPercentage(number.toInt)
    }
  }
}
