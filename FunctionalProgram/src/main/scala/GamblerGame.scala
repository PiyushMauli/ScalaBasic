import scala.io.StdIn
import scala.util.Random

object GamblerGame {
  def playGame(amountDeposite:Int,number:Int)={
    var amount=amountDeposite
    var numOfSpin=number
    while(numOfSpin>0){
      if(amount>=500){
        amount-=500
        val guessNumber=StdIn.readLine("Guess a number in between 1 to 10 : ").toInt;
        var randomeNumber=new Random().nextInt(10)
        println(randomeNumber)

        if(guessNumber==randomeNumber){
          println("Congratulations !!! you won the game !!!")
          println("Your amount :"+(amount+1000))
        }else{
          println("Sorry !!! You Loss the game !!")
          println("Your amount is :"+(amount))
        }
      }else{
        numOfSpin=0
      }
      numOfSpin=numOfSpin-1
    }

  }
  def main(args: Array[String]): Unit = {
    val amount=StdIn.readLine("Enter hwo much amount money you want to deposite ?? : ").toInt
    val number=StdIn.readLine("How many times you want to play game ?? :").toInt
    GamblerGame.playGame(amount,number)
  }
}
