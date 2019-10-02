

object Q1 {
  def main(args: Array[String]) {

    var n = scala.io.StdIn.readInt()
    var numbers = new Array[Int](n)
    var total = 0
    for (x<-0 to (n-1)) {
      numbers(x) = scala.io.StdIn.readInt()
      total = total + numbers(x)
    }

    var average = total.toFloat/n

    println("average : " + average)

    var sNum = numbers(0)

    for(x<-1 to (n-1)){
	    if(numbers(x)<sNum)
  	    sNum = numbers(x)
    }

    for(x<-0 to (n-1)){
      if(numbers(x)==sNum)
  	    println("Index of smallest number : " + x)
    }
  }
}