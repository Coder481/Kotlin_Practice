package functional.higherOrder

class PassingFunction {

    /**
     * Passing function which takes nothing and returns nothing/Unit
     */
    private fun higherFunc(myFunc:() -> Unit){
        myFunc()
    }

    private fun myFunc() = print("My Function")
    fun main(){
        higherFunc(::myFunc)
    }

    /**
     * Passing function which takes something and returns nothing/Unit
     */
    // receives two parameters, String and Function
    private fun higherFuncSome(str:String, myFuncSome: (String) -> Unit){
        myFuncSome(str)
    }

    // take String as parameter and returns nothing/Unit
    private fun printStr(s:String) = println(s)
    fun mainSome(){
        higherFuncSome("Function that takes something",::printStr) // passing fun using (::)
    }


    /**
     * Passing function which takes something and returns something
     */
    private fun higherSome(str:String, myFunction:(String)->String){
        val res = myFunction(str)
        println(res)
    }

    private fun getStr(s:String):String{
        return "$s: Concatenate"
    }
    fun main2(){
        higherSome("TSRS",::getStr)
    }
}