package functional.higherOrder

class ReturningFunction {

    // Defining a simple function which takes two integer type argument and returns their addition
    private fun sum(a:Int, b:Int):Int{
        return a+b
    }

    // defining a higher order function that takes nothing and returns function sum()
    private fun higherFunc() : ((Int,Int)->Int){
        return this::sum
    }

    fun main(){
        val a=2
        val b=3

        // invoke higher function and store returned function into a variable
        val add = higherFunc()

        // invoke sum() function by passing arguments
        val res = add(a,b)

        // use returned value of sum() function
        println("Sum of $a and $b: $res")
    }

}