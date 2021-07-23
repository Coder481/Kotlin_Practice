package controlFlow.loops

/**
 * In Kotlin, for loop is used to iterate through the following because all of them provides iterator.
        Range
        Array
        String
        Collection
 */

class ForLoop {

    /**
     * Iterate through Range
     *      The "in" operator used in for loop to check value lies within the Range or not
     */
    fun loopInRange(){
        println("Continuous Range")
        for (i in 1..10) {
            print("$i ")
        }
        println()
        for (c in 'a'..'j') {
            print("$c ")
        }

        println("\nLoop with steps")
        for (i in 1..20 step 2){
            print("$i ")
        }

        println("\nLoop from down to top (using downTo operator)")
        for (i in 5 downTo 1){
            print("$i ")
        }

        println("\nLoop from down to top with steps")
        for (i in 20 downTo 1 step 3){
            print("$i ")
        }
        println()
        for (c in 'z' downTo 's' step 2) {
            print("$c ")
        }
    }


    /**
     * Iterate through array
     *      There are the following you can traverse array:
     *                  Without using Index property
     *                  With Using Index property
     *                  Using withIndex Library Function
     */

    fun loopInArray(){
        val alphabets = arrayOf("a","b","c","d","e","f","g","h","i","j")

        println("Loop without using index property")
        for (a in alphabets){
            print("$a ")
        }

        println("\nLoop using index property")
        for (i in alphabets.indices){
            if (i and  1 == 0){
                print("${alphabets[i]} ")
            }
        }

        println("\nLoop using withIndex() library function")
        for ((index,value ) in alphabets.withIndex()){
            println("Element at index $index is $value")
        }
    }


    /**
     * Iterate through string
     *      It is similar to the iteration through the array
     */
    fun loopInString(){
        val strings = "abcdefghij"

        println("Loop without using index property")
        for (num in strings){
            print("$num ")
        }

        println("\nLoop using index property")
        for (i in strings.indices){
            if (i and  1 == 0){
                print("${strings[i]} ")
            }
        }

        println("\nLoop using withIndex() library function")
        for ((index,value ) in strings.withIndex()){
            println("Element at index $index is $value")
        }
    }


    /**
     * Iterate through collection
     */
    fun loopInCollection(){
        val list = listOf(1,2,3,"Hello","World")
        for (e in list) print("$e ")
    }


}