package controlFlow.loops

/**
 * You can define your own iterators in your classes by implementing the iterator operator in them
 */

class Iterators {

    fun iterate() {

        val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion"), Animal("Monkey"), Animal("Deer")))

        for (animal in zoo) {                                   // 3
            println("A ${animal.name}")
        }

    }

    class Animal(val name: String)

    class Zoo(val animals: List<Animal>) {

        operator fun iterator(): Iterator<Animal> {             // 1
            return animals.iterator()                           // 2
        }
    }

}

/**
    1.  Defines an iterator in a class. It must be named iterator and have the operator modifier.
    2.  Returns the iterator that meets the following method requirements:
            next(): Animal
            hasNext(): Boolean
    3.  Loops through animals in the zoo with the user-defined iterator.

The iterator can be declared in the type or as an extension function.

 */


