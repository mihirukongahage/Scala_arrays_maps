import scala.io.Source

object question_1 {
   def main(args: Array[String]) {
      var len = 0
      var count: Map[String, Int] = Map()
      var lines = scala.io.StdIn.readLine().split("")
      var x = lines.distinct
      for(t <- x){
          len = len + 1
          print(t+" ")
      }
      println()
      println("Length : "+len)

    }
}