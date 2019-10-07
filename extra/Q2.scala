

object Q2 {
  def main(args: Array[String]) {
    val a = Array(1,2,3)
    val b = Array(4,5,6)

    val c = a ++ b
    
    for(x<-0 to (c.length-1)){
      print(c(x) + " ")
    }

  }
}