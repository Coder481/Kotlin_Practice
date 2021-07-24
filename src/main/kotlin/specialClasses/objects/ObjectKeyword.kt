package specialClasses.objects

import java.util.*

/**
 * Classes and objects in Kotlin work the same way as in most object-oriented languages:
 * a class is a blueprint, and an object is an instance of a class. Usually,
 * you define a class and then create multiple instances of that class
 */

class ObjectKeyword {

    // Defines a blueprint with a constructor
    class LuckDispatcher constructor(a:Int,b:Int){
        private val sum = a+b
        // Defines a method
        fun getNumber() {
            val objRandom = Random()
            println(objRandom.nextInt(90))
        }
        fun printSum() = println("Sum is $sum")
    }




    fun main() {
        // Creates instances
        val d1 = LuckDispatcher(2,3)
        val d2 = LuckDispatcher(4,5)
        val d3 = LuckDispatcher(10,20).printSum()

        // Calls the method on instances.
        d1.getNumber()
        d2.getNumber()
    }
}