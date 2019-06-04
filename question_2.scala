import scala.io.Source

object question_1 {
   def main(args: Array[String]) {
      var tot = 0
      var count: Map[String, Int] = Map()
      var lines = scala.io.StdIn.readLine().split("")
      for(t <- lines){
          tot = tot + 1;
          if(t == "a" || t == "e" || t == "i" || t == "o" || t == "u"){
              if(count.contains(t)){
                    count = count + (t -> (count(t)+1))
                }
              else{
                count = count + (t -> 1)
                }
          }
      }
      println(count.maxBy(_._2))
   
   println("Total Count : "+tot)
}
}