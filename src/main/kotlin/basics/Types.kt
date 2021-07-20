package basics

class Types {
    fun mainTypes() {
        val a: Int = 10000
        val d: Double = 100.00
        val f: Float = 100.00f
        val l: Long = 1000000004
        val s: Short = 10
        val b: Byte = 1
        val str: String = "String"

        println("Your Int Value is $a")
        println("Your Double  Value is $d")
        println("Your Float Value is $f")
        println("Your Long Value is $l")
        println("Your Short Value is $s")
        println("Your Byte Value is $b")
        println("Your String Value is $str")

        print("\nEnter an integer: ")
        try{
            val inp = readLine()?.toInt()
            println("You enter $inp")
        }catch (e : NumberFormatException){
            print(e.localizedMessage)
        }
    }


}