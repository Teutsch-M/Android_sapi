package fundamentals

fun main(){
    println("Hello")

    val num1 = 2
    val num2 = 3

    println("$num1 + $num2 = ${num1 + num2}")

    /* Fel 2*/
    val daysOfWeek : List<String> = listOf("Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")


    fun kiirWeek() {

        for (item in daysOfWeek) {
            println(item)
        }

        //  daysOfWeek.forEach{println(it)}
    }

    fun startWT(){

    /*
    val startWithT = daysOfWeek.filter { it[0]=='T' }
    println(startWithT)
    */

        daysOfWeek.filter { it.startsWith(char = 'T') }.forEach { println(it) }
    }



    //kiirWeek()
    //startWT()

    fun isPrime(number: Int) : Boolean{

        for(i in 2..number/2){
            if(number%i == 0)
                return false
        }

        return true
    }

    //println(isPrime(36))

    fun messageCoding(msg: String, func: (String) -> String): String{


    }

    fun decode(message:String) : String{


    }


    //messageCoding(msg:"SGkgdGhlcmUuIEhvdyBhcmUgeW91Pw==", ::encode)

}
