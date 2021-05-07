object Quadratic {
  def main(args: Array[String]): Unit = {
    var a=args(0).toInt
    var b=args(1).toInt
    var c=args(2).toInt

    println(a,b,c)

    println(Math.pow(b,2))

    var delta=Math.pow(b,2)-(4*a*c)
    println(delta)

    println((-b+(Math.sqrt(delta)))/(2*a))
    println((-b-(Math.sqrt(delta)))/(2*a))
  }
}
