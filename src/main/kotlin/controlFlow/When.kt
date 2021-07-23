package controlFlow

/**
 * Instead of the widely used switch statement,
 * Kotlin provides the more flexible and clear "when" construction.
 * It can be used either as a statement or as an expression.
 */

class When {

    /**
     * "when" as Statement:
     *          when can be used as a statement with or without else branch.
     */

    fun whenAsStatement(){
        filter("Hello")
        filter(1)
        filter(23)
        filter(2L)
        filter(MyClass())
        filter(0.2)
    }

    /**
     * Note that all branch conditions are checked sequentially until one of them is satisfied.
     * So, only the first suitable branch will be executed
     */
    private fun filter(obj : Any){
        when(obj) {
            is String -> println("String is passed")
            1 -> println("1 is passed")
            is Long -> println("Long is passed")
            is MyClass -> println("Class is passed")
            else -> {
                val type = "${obj::class.simpleName}"
                println("Something Else of Type={$type}")
            }
        }
    }



    /**
     * "when" as expression
     *          It is mandatory to use else while using when as an expression
     *          otherwise compiler will give an error:
     *          'when' expression must be exhaustive, add necessary 'else' branch
     */
    fun whenAsExp(){
        println(filteredRes("Hello"))
        println(filteredRes(1))
        println(filteredRes(23))
        println(filteredRes(2L))
        println(filteredRes(MyClass()))
        println(filteredRes(2.9))
    }
    private fun filteredRes(obj : Any): String{
        val result = when(obj) {
            is String -> "String is passed"
            1 -> "1 is passed"
            is Long -> "Long is passed"
            is MyClass -> "Class is passed"
            else -> {
                val type = "${obj::class.simpleName}"
                "Something Else of Type={$type}"
            }
        }

        return result
    }

    /**
     * We can combine multiple branches in a single branch
     * separating each element with comma
     */
    fun singleBranchedWhen(){
        combinedBranches(2L)
        combinedBranches(23)
        combinedBranches("Hello")
        combinedBranches('H')
        combinedBranches(2.5)
        combinedBranches(2.5f)
        combinedBranches(MyClass())
    }
    private fun combinedBranches(obj : Any){
        when(obj){
            is Long, is Int, is Double, is Float -> println("Numeric value")
            is String, is Char -> println("Alphabet/Expression")
            else -> println("Something else")
        }
    }


    /**
     * Check that entered value in range or not
     */
    fun inRangeWhen(){
        printRange(4)
        printRange(34)
        printRange(29)
        printRange(48)
        printRange(55)
    }
    private fun printRange(i : Int){
        when(i){
            in 1..10 -> println("Between 1-10")
            in 11..20 -> println("Between 11-20")
            in 21..30 -> println("Between 21-30")
            in 31..40 -> println("Between 31-40")
            in 41..50 -> println("Between 41-50")
            else -> println("Above 50")
        }
    }


    class MyClass
}