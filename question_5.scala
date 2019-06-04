import scala.io.Source
import scala.collection.mutable.Queue
object question_5{
    def main(args:Array[String]){
        println( "Input the number of elements to be stored in the array:");
        var noOfNumbers= scala.io.StdIn.readInt;
          println( "Input "+ noOfNumbers + " elements in the array:");
        var array = new Array[Int](noOfNumbers);
       for( a <- 0 to noOfNumbers-1){
         println( "Element -" + a +" :");
            array{a}= scala.io.StdIn.readInt;
      }
       var list = array.toList;
       list=list.sorted
    println(list);
   var que0 = Queue[Int]()
    var que1 = Queue[Int]()
     var que2 = Queue[Int]()
     var sum =0;
    list.foreach(i=>{
        sum +=i
        if(i%3==0){
            que0.enqueue(i)
        }
        else if(i%3==1){
               que1.enqueue(i)
        }
        else{
               que2.enqueue(i)
        }
    })
    if((sum%3)==1){
        if(!que1.isEmpty){
            que1.dequeue();
        }
        else{
            if(!que2.isEmpty){
                que2.dequeue();
            }
            // else 
                // return 0;
            if(!que2.isEmpty)
            {
                que2.dequeue();
            } 
            // else
                // return 0;
       }
    }

    else if ((sum % 3) == 2) { 
        
        if (!que2.isEmpty) 
            que2.dequeue(); 
  
       
        else { 
            if (!que1.isEmpty) 
                que1.dequeue(); 
            // else
                // return 0; 
  
            if (!que1.isEmpty) 
                que1.dequeue(); 
            // else

                // return 0; 
        } 
    } 
    var list1=que0.toList + que1.toList + que2.toList ;
   
    
    println(list1);
  
    }
}

