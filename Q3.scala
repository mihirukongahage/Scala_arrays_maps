object Q3 {
    def main(args: Array[String]) {
        val input = scala.io.StdIn.readLine()
        print(find_cap(input))
    }

    def find_cap(sentence: String): Char = {
        if(sentence(0).toByte < 91 && sentence(0).toByte > 59)
            return sentence(0)
        else
            return find_cap(sentence.substring(1,sentence.length))
    }
}