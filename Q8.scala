object Q8 {
    def main(args: Array[String]) {
        print("Enter the size of arrays : ")
        val size = scala.io.StdIn.readInt()
        var list1: List[Int] = List()
        var list2: List[Int] = List()
        var list3: List[Int] = List()

        println("Enter numbers for the first array")
        for (i <- 0 to size-1) {
            list1 = scala.io.StdIn.readInt() :: list1
        }

        println("Enter numbers for the second array")
        for (i <- 0 to size-1) {
            list2 = scala.io.StdIn.readInt() :: list2
        }

        for (i <- 0 to size-1) {
            list3 = (list1(i)*list2(i)) :: list3
        }

        list1 = list1.reverse
        list2 = list2.reverse

        print("Arr1")
        print(" ")
        print("Arr2")
        print("  ")
        println("Arr3")
        for (i <- 0 to size-1) {
            print(list1(i))
            print("    ")
            print(list2(i))
            print("      ")
            println(list3(i))
        }
    }
}