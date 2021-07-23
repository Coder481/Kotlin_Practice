package basics

class Classes{

    /**
     * Creating Model class with "data class" in kotlin
     */

    data class User(                                                                                    // 1
        var id:Long,
        val name:String = "Hrithik",
        val surName:String = "sharma",
        var eMail:String
    ){
        override fun equals(other: Any?): Boolean {     // 4
            return other is User && other.id == this.id
        }

        override fun hashCode(): Int {
            var result = id.hashCode()
            result = 31 * result + name.hashCode()
            result = 31 * result + surName.hashCode()
            result = 31 * result + eMail.hashCode()
            return result
        }
    }
    fun main(){

        val user = User(id = 132456789, eMail = "abc@xyz.com", surName = "Sharma")                      // 2
        user.id = 123                                                                                   // 3
        val user1 = User(id = 132456789, eMail = "abc@xyz.com", surName = "Sharma")
        println("user == user1 : ${user==user1}")
        println("Name=${user.name}(${user.id})" +
                "\nSurname=${user.surName}" +
                "\nEmail=${user.eMail}")
    }

    /**
     1. Creating a data class to access as a model class with some parameters
            ->  Here some parameters are initialized and some not

     2. Creating an object for the data class "User" by passing values to the parameters
            ->  Values of the unInitialized parameters must be passed
            ->  But values of the initialized parameters are optional

     3. Changing the value of the created object of data class and printing the User data
     4. Override the default equals method by declaring users equal if they have the same id
     */
}