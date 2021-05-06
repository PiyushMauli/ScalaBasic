import scala.io.StdIn

object InputProgram {
  def input(userName:String):Unit={
    if(userName.length > 3){
      println("Your Name is : "+userName)
    }else{
      println("input name length should be greater than 3")
    }
  }
  def main(args: Array[String]): Unit = {
    val userName=StdIn.readLine("Please Enter Your Name :")
    InputProgram.input(userName)
  }
}
