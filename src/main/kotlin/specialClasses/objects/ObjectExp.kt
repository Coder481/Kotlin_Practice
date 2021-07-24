package specialClasses.objects

/**
 * Here is a basic typical usage of an object expression:
 * a simple object/properties structure.
 * There is no need to do so in class declaration:
 * you create a single object, declare its members and access it within one function.
 * Objects like this are often created in Java as anonymous class instances
 */

class ObjectExp {
    private fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

        val dayRates = object {                                                     //2
            var standard: Int = 30 * standardDays
            var festivity: Int = 50 * festivityDays
            var special: Int = 100 * specialDays
        }

        val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

        println("Total price: $$total")                                               //4

    }

    fun main() {
        rentPrice(10, 2, 1)                            //5
        rentPrice(12, 4, 2)
    }
}
/**
*    1.  Creates a function with parameters.
*    2.  Creates an object to use when calculating the result value.
*    3.  Accesses the object's properties.
*    4.  Prints the result.
*    5.  Calls the function. This is when the object is actually created.
 */