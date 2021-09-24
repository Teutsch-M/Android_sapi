package fundamentals

import java.util.*
import kotlin.random.Random


fun main(){
    println("Hello")

    val num1 = 2
    val num2 = 3

    println("$num1 + $num2 = ${num1 + num2}")


    /** Fel 2*/
    val daysOfWeek : MutableList<String> = mutableListOf("Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")


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

    fun containsE(){
        daysOfWeek.filter { it.contains(char = 'e') }.forEach{ println(it)}
    }

    fun length6(){
        daysOfWeek.filter { it.length == 6 }.forEach{println(it)}
    }

  //  kiirWeek()
  //  startWT()
  //  containsE()
    // length6()


    /**  Fel 3 */
    fun isPrime(number: Int) : Boolean{

        if(number == 1) return false

        for(i in 2..number/2){
            if(number%i == 0)
                return false
        }

        return true
    }

    fun primeInRange(first: Int , last: Int){
        for (i in first..last){
            if(isPrime(i)) println(i)
        }
    }

    //println(isPrime(36))
    //primeInRange(1,100)


/** Fel 4 */

    fun encode(message: String) : String{
        val encodedString = Base64.getEncoder().encodeToString(message.toByteArray())
        return encodedString
    }

    fun decode(message: String) : String{
        val decodedString = Base64.getDecoder().decode(message)
        return String(decodedString)
    }

    //println(decode("SGkgdGhlcmUuIEhvdyBhcmUgeW91Pw=="))


    fun messageCoding(msg: String, func: (String) -> String): String{

        return  func(msg)
    }


  // println( messageCoding("Teutsch Mihaly Richard", ::encode))
  // println( messageCoding("VGV1dHNjaCBNaWhhbHkgUmljaGFyZA==", ::decode) )


    /** Fel 5 */

    val numList : List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)

    fun evenNums(numbers: List<Int>) = numbers.filter { it % 2 == 0 }.forEach{println(it)}

    //evenNums(numList)


    /** Fel 6*/

    fun double(){
        numList.map { it*2 }.forEach{println(it)}
    }
    //double()

    fun capitalize(){
        daysOfWeek.map { it.toUpperCase() }.forEach{ println(it)}
    }
    //capitalize()

    fun firstUpper(){
        daysOfWeek.map { it.first().toUpperCase() }.forEach{ println(it)}
    }
    //firstUpper()

    fun dayLength(){
        daysOfWeek.map{it.length}.forEach{ println(it)}
    }
    //dayLength()

    fun avgDayLength() : Int{
        var avg = 0
        daysOfWeek.map{it.length}.forEach{ avg +=it}
        return avg/7
    }
    //println(avgDayLength())


    /** Fel 7 */

    fun removeNDays(){
        daysOfWeek.filter { it.contains(char = 'n') }.forEach{ daysOfWeek.remove(it)}
        //kiirWeek()
        for ((index, value) in daysOfWeek.withIndex()) {
            println("Item at $index is $value")
        }
        daysOfWeek.sort()
        kiirWeek()

    }
     //removeNDays()


    /** Fel 8 */

    val randomAr = Array(10){Random.nextInt(0,100)}
    //randomAr.forEach{println(it)}
    randomAr.sort()
    randomAr.forEach{println(it)}

    fun containsEven() : Boolean{
        for (i in randomAr){
            if (i%2==0)
                return true
        }
        return false
    }

    println(containsEven())

    fun isAllEven() : Boolean {
        for (i in randomAr){
            if(i%2!=0)
                return false
        }
        return true
    }

    println(isAllEven())


    fun avg(){
        var avg = 0
        randomAr.forEach { avg+=it }
        println(avg/10)
    }
    avg()
}

