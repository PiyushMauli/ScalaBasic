import scala.collection.mutable.ListBuffer
import scala.io.StdIn

class CheckNotes(var rupees:Int){
  def calculateNumberOfNotes()={
//    var rupees=rupee
    val arrOfNotes=Array(1000,500,100,50,10,5,2,1)
    val rupeesList=ListBuffer[Int]();

    var numberOfNotes=0
    while(rupees>0){
      for(i <- arrOfNotes){
        numberOfNotes=numberOfNotes+(rupees/i)
        if((rupees/i) > 0){
          rupeesList.append(i)
        }
        rupees=rupees%i
      }
    }

//    println("Total number of Notes : "+numberOfNotes)
//    println(rupeesList)

    numberOfNotes
  }
}

object VendingMachine {
  def main(args: Array[String]): Unit = {


    val rupees=StdIn.readLine("Enter how much amount you want to withdraw : ").toInt

    val checkNotes=new CheckNotes(972)
    println("Number of notes : "+checkNotes.calculateNumberOfNotes())
  }
}
