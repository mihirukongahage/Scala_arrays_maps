import scala.io.Source
object question_6{
    def main(args:Array[String]){
        println( "Input the number of elements to be stored in the array:");
        var noOfNumbers= scala.io.StdIn.readInt;
          println( "Input "+ noOfNumbers + " elements in the array:");
        var array = new Array[Int](noOfNumbers);
       for( a <- 0 to noOfNumbers-1){
         println( "Element -" + a +" :");
            array{a}= scala.io.StdIn.readInt;
      }
        var list =array.toList
        var map =list.groupBy(identity).mapValues(_.size)
         println("The unique elements found in the array are:")
         map.keys.foreach{ i =>  
         if(map(i)==1){
                 println(i);
         }
        }
   
      
    }
}