object Q4 {
    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        val chars = input.toCharArray()
        var list: List[Char] = List();
        var newStr: String = "";
        for (char <- chars) {
            if(!(list.contains(char))){
                list = char :: list
                newStr = newStr + char.toString
            }
        }
        println(newStr)
    }
}