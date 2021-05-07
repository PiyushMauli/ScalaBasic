import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
import java.text.SimpleDateFormat
import java.util.Date
import scala.io.StdIn


object Stopwatch {
  def main(args: Array[String]): Unit = {
    val start=new Date().getTime
    val num=StdIn.readLine("Enter 1 to stop the timer").toInt
    if(num==1){
      val end=new Date().getTime
      println((end-start)/1000f+" sec")
    }

  }
}

//object Stopwatch {
//  def main(args: Array[String]): Unit = {
//
//    val obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss")
//    val dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss")
//
//    var date1:Date=new Date()
//    var date2:Date=new Date()
//
//    var startVal=StdIn.readLine("Enter 1 to start the value").toInt
//var flag=true
//
//      while(flag){
//        startVal=StdIn.readLine("Enter 0 to stop the timer : ").toInt
//        startVal match {
//          case 1=>{
//            val now=LocalDateTime.now()
//            date1=obj.parse(dtf.format(now))
//            println(date1)
//          }
//          case 0=>{
//            val end = LocalDateTime.now()
//            date2=obj.parse(dtf.format(end))
//            println(date2)
//            flag=false
//          }
//        }
//      }

//    val time_difference = date2.getTime - date1.getTime
//
//    println( (time_difference / 1000) % 60)


//    val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//    val now = LocalDateTime.now();
//    for(i<-1 to 1000000000){
//      for(j<- 1 to 10000000){
//
//      }
//    }
//    val end = LocalDateTime.now();
//    println(((end.getSecond-now.getSecond)/1000)%60)

//  }

//    var startTime:Any=null
//    var endTime:Any=null
//    while(true){
//      val startStop=StdIn.readLine("Enter 1 to start the stopwatch").toInt
//      startStop match{
//        case 1=>startTime = Calendar.getInstance.get(Calendar.DATE)
//        case 2=>{
//          endTime=Calendar.getInstance.get(Calendar.DATE)
//          println(endTime-startTime)
//        }
//      }
//    }
//  }
//}
