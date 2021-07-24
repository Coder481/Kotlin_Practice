package specialClasses.objects

/**
 * An object declaration inside a class defines another useful case: the companion object.
 * Syntactically it's similar to the static methods in Java:
 * you call object members using its class name as a qualifier.
 * If you plan to use a companion object in Kotlin, consider using a package-level function instead.
 */

class ObjectCompanion {

    class BigBen {                                  //1

        companion object {                          //2
            fun getBongs(nTimes: Int) {             //3
                for (i in 1 .. nTimes) {
                    print("BONG ")
                }
            }
        }

    }

    fun main(){
        BigBen.getBongs(10)                     //4
    }
}

/**
1.  Defines a class.
2.  Defines a companion object.
3.  Defines a companion object method.
4.  Calls the companion object method via the class name without initializing the class (BigBen).
 */