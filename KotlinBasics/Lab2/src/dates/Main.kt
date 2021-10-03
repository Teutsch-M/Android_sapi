package dates

import java.util.Random

fun main(){

    var s = 0
    val list = mutableListOf<Date>()
    val comp = Comparator.comparingInt<Date> {it.year}. thenComparingInt { it.month }. thenComparingInt { it.day }

    while(s<10){
       val datum = Date(Random().nextInt(-3000,3000),Random().nextInt(-12,12),Random().nextInt(-31,31))
        if(datum.isValid()) {
            list.add(s, datum)
            s++
        }
        else
            println(datum)

    }
    println("Valid: ")
    list.forEach{ println(it)}


    list.sortWith(comp)
    println("Ordered: ")
    list.forEach{ println(it)}

    list.reverse()
    println("Reversed: ")
    list.forEach { println(it) }

}