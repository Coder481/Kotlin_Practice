package basics


/**
 * Kotlin has powerful type inference.
 * While you can explicitly declare the type of a variable,
 * you'll usually let the compiler do the work by inferring it.
 * Kotlin does not enforce immutability, though it is recommended.
 * In essence use val over var.
 *
 * var -> mutable variable
 * val -> immutable variable
 */

class Variables {

    var a : String = "I am a String"    // 1
    val b : Int = 123                   // 2
    val c = 123.0                       // 3
    fun mainVar(){
        println("String $a, Type={${a::class.simpleName}}")  // 4
        println("String $b, Type={${b::class.simpleName}}")
        println("String $c, Type={${c::class.simpleName}}")

    }

    //val e:Int             // 5

}

/**

1.  Declares a mutable variable and initializes it.
2.  Declares an immutable variable and initializes it.
3.  Declares an immutable variable and initializes it without specifying the type.
    The compiler infers the type Int.
4.  Printing mutable string with its type=String
5.  Using variable without initializing gives an error "Property must be initialized or be abstract"

    Note: Variables must be initialized before its first read
 */