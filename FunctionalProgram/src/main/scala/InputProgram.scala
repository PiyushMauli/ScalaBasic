object InputProgram {
  def input(userName:String):Unit={
    if(userName.length > 3){
      println("Your Name is : "+userName)
    }else{
      println("input name length should be greater than 3")
    }
  }
  def main(args: Array[String]): Unit = {
    InputProgram.input("Piyush")
  }
}
