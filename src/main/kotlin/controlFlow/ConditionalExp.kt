package controlFlow

/**
 * There is no ternary operator "condition ? then : else" in Kotlin.
 * Instead, "if" may be used as an expression:
 */

class ConditionalExp {

    fun findGreater(){
        println(max(44,99))
        println(max(24,-24))

    }

    // if is an expression here: it returns a value
    private fun max(a:Int, b:Int) = if(a>b) a else b

}