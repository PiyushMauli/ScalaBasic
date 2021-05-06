object InputProgram {
  def input(str:String):Unit={
    if(str.length > 3){
      println("Your Name is : "+str)
    }else{
      println("input name length should be greater than 3")
    }
  }
  def main(args: Array[String]): Unit = {
    InputProgram.input("Piyush")
  }
}
