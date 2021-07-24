package functional.higherOrder

/**
 * In Kotlin, a function which can accepts a function as parameter or can returns a function
 * is called Higher-Order function.
 * Instead of Integer, String or Array as a parameter to function, we will pass anonymous function or lambdas.
 */
class PassingLambda {

    /**
     * Passing lambda expression which returns nothing/Unit
     */
    private fun higherFuncLambda(lambda:() -> Unit){ // 1
        lambda()
    }

    private val printLambda = { println("Lambda Expression")}  // 2
    fun lambdaWithUnit(){
        higherFuncLambda(printLambda)          // 3
    }
    /**
     * 1.   we define a higher-order function which contains one parameter:-  lambda:() -> Unit
     *                lambda is local name for the receiving lambda parameter.
     *                () represents that the function does not accept any arguments.
     *                Unit represents that function does not return any value.
     *
     * 2.   we define a lambda expression which contains println() to print string to the standard output
     *
     * 3.   we have invoked the higher-order function by passing the lambda expression as parameter:- higherFuncLambda(lambda)
     */




    /**
     * Passing lambda expression which returns something
     */
    // higher order function which returns Integer (result of lambda + 1)
    private fun higherFuncAddOne(lambda: (Int,Int) -> Int) : Int {
        // invokes the lambda expression by passing parameters
        return lambda(2,4) + 1
    }

    private val lambdaSum = {a:Int, b:Int -> a+b} // lambda expression
    fun lambdaAdd(){
        println("Sum of 2 and 4 (+1): "+higherFuncAddOne(lambdaSum)) //passing lambda as parameter
    }

}