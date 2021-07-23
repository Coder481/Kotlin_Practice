package specialClasses

/**
 * In programming, sometimes there arises a need for a type to have only certain values.
 * To accomplish this, the concept of enumeration was introduced.
 * Enumeration is a named list of constants.
 *
 * Some important points about enum classes in kotlin –
 *      Enum constants aren’t just mere collections of constants- these have properties, methods etc
 *      Each of the enum constants acts as separate instances of the class and separated by commas.
 *      Enums increases readability of your code by assigning pre-defined names to constants.
 *      An instance of enum class cannot be created using constructors
 */

class Enum {

    /**
     * Properties of enum class:
     *      ordinal: This property stores the ordinal value of the constant, which is usually a zero-based index.
     *      name: This property stores the name of the constant
     *
     * an enum has its own specialized type, indicating that something has a number of possible values.
     * Unlike Java enums, Kotlin enums are classes.
     *
     * Methods of enum class:
     *      values: This method returns a list of all the constants defined within the enum class.
     *      valueOf: This methods returns the enum constant defined in enum,
     *               matching the input string. If the constant, is not present in the enum,
     *               then an IllegalArgumentException is thrown.
     */
    // Defining enum class Days
    enum class Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY

    }
    fun showDays()
    {
        // A simple demonstration of properties and methods
        for (day in Days.values()) {
            println("${day.ordinal} = ${day.name}")
        }
        println("${Days.valueOf("WEDNESDAY")}")
    }




    // A property with default value provided
    enum class WeekDays(val isWeekend: Boolean = false){
        SUNDAY(true),
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        // Default value will be overridden
        SATURDAY(true);

        fun isDayWeekend() = ((this.name).compareTo(SATURDAY.toString())==0 || (this.name).compareTo(SUNDAY.toString())==0)

        companion object{
            fun isWeekend(obj:WeekDays):Boolean{
                return (obj.name).compareTo(SATURDAY.toString())==0 || (obj.name).compareTo(SUNDAY.toString())==0
            }
        }
    }
    fun showWeekDays(){
        // A simple demonstration of properties and methods
        for(day in WeekDays.values()) {
            println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
        }
        val today = WeekDays.MONDAY;
        println("Is today a weekend ${WeekDays.isWeekend(today)}")
        println("Is today a weekend ${today.isDayWeekend()}")
    }






    // Created a function "containsRed()" for all the enum constants
    enum class Color(val rgb: Int) {                      // 1
        RED(0xFF0000),                                    // 2
        GREEN(0x00FF00),
        BLUE(0x0000FF),
        YELLOW(0xFFFF00);

        fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
    }

    fun showColors() {
        val red = Color.RED
        println(red)                                      // 4
        println(red.containsRed())                        // 5
        println(Color.BLUE.containsRed())                 // 6
        println(Color.YELLOW.containsRed())               // 7
    }

}