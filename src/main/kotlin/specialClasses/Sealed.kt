package specialClasses

/**
 * Sealed classes let you restrict the use of inheritance.
 * Once you declare a class sealed,
 * it can only be subclassed from inside the same package where the sealed class is declared.
 * It cannot be subclassed outside of the package where the sealed class is declared.
 */
class Sealed {

    private fun greetMammal(mammal: Mammal): String {
        return when (mammal) {
            is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
            is Cat -> "Hello ${mammal.name}"
        }
    }

    fun main() {
        println(greetMammal(Cat("Snowy")))
    }
}

sealed class Mammal(val name: String)

class Cat(private val catName: String) : Mammal(catName)
class Human(private val humanName: String, val job: String) : Mammal(humanName)