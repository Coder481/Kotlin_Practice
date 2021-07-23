package controlFlow.loops

class WhileAndDoWhile {

    /**
     * while loop
     */
    // Iterate through range
    fun whileInRange(){
        var num = 0
        while (num < 11) {
            print("$num ")
            num++
        }
    }

    // Iterate through collection
    fun whileInCollection(){
        val list = listOf(1,2,3,"Hello","World")
        var i = 0
        while (i < list.size){
            print("${list[i]} ")
            i++
        }
    }


    /**
     * do-while loop
     */
    fun doWhileInRange(){
        var number = 6
        var factorial = 1

        do {
            factorial *= number
            number--
        }while(number > 0)
        println("Factorial of 6 is $factorial")
    }
}