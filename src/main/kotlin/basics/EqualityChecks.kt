package basics

class EqualityChecks {

    /**

    Structural Equality –
        Structural equality is checked through the == operator and its inverse != operator.
        By default, the expression containing x==y is translated into the
        call of equals() function for that type.

     */
    fun structuralEquality(){
        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writers = setOf("Twain", "Shakespeare", "Hemingway")

        println(authors == writers)
        //Returns true because it calls authors.equals(writers) and "sets" ignore order of the elements.
    }

    /**

    Referential Equality –
        The referential equality in Kotlin is checked
        through the === operator and its inverse !== operator.
        This equality returns true only if both the instances of a type
        point to the same location in memory.

     */
    fun  referentialEquality(){
        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writers = setOf("Twain", "Shakespeare", "Hemingway")

        println(authors === writers)
        //Returns false because authors and writers are distinct references.
    }
}