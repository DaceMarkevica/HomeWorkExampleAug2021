import java.util.Calendar
import scala.io.StdIn.readLine

object Age100 extends App {

  val now = Calendar.getInstance()
  val currentYear= now.get(Calendar.YEAR) // so now i do not need to ask for year anymore
  val currentMonth= now.get(Calendar.MONTH) // months just like most things in programming start with 0
  println(s"Current yaer is $currentYear and month is $currentMonth")
  //  val currentYear = readLine ("What year is it?").toDouble
  val userName = readLine("What is your name?")
  println(s"Hi, $userName!")
  val userAge = readLine("How old are you?").toDouble
  val targetAge = 100
  //  val yearWhen100 = (targetAge-userAge+currentYear).toInt
  val yearWhen100 = (targetAge-userAge+currentYear).round // another option, difference being thiw would round up from 0.5 to 1
   println(s"$userName, it will be year $yearWhen100 when you will turn 100 years old!")
}
