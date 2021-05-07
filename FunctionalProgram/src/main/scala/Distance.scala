object Distance {
  def main(args: Array[String]): Unit = {
    var x= Math.pow(args(0).toInt,args(0).toInt)
    var y= Math.pow(args(1).toInt,args(1).toInt)
    println(x+" "+y)
    println(Math.sqrt(x+y))
  }
}
