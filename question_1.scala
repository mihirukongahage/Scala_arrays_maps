import scala.io.Source

object question_1 {
   def main(args: Array[String]) {
      var tot = 0
      var count: Map[String, Int] = Map()
      var lines = scala.io.StdIn.readLine().split("")
      for(t <- lines){
          tot = tot +
          if(t == "a" || t == "e" || t == "i" || t == "o" || t == "u"){
              if(count.contains(t)){
                    count = count + (t -> (count(t)+1))
                }
              else{
                count = count + (t -> 1)
                }
          }
          
      }
      for(v <- count){
         println(v)
      }
   
   println("Total Count : "+tot)
}
}