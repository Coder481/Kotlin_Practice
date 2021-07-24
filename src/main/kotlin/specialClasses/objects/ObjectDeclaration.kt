package specialClasses.objects

/**
 * You can also use the object declaration.
 * It isn't an expression, and can't be used in a variable assignment.
 * You should use it to directly access its members
 */
class ObjectDeclaration {

    object DoAuth {                                                 //1
        fun takeParams(username: String, password: String) {        //2
            println("input Auth parameters = $username:$password")
        }
    }

    fun main(){
        DoAuth.takeParams("foo", "qwerty")                          //3
    }

}
/**
    1.  Creates an object declaration.
    2.  Defines the object method.
    3.  Calls the method. This is when the object is actually created.
 */