package extensions

fun main(){

    var name = "John Smith"
    fun String.monogram() = this.split(' ').map { it.first() }.joinToString ("")
    println(name.monogram())


    val list = listOf<String>("apple","pear","strawberry","melon")

    fun List<String>.joinBySeparator(sep : Char) : String {
        var joined : String = ""
        this.forEach{ joined+= "$it$sep" }
        return joined.dropLast(1)
    }

    println(list.joinBySeparator('#'))

    fun List<String>.longest() : String{
        var longestS : String = ""
        this.forEach{ longestS = if (it.length > longestS.length) it else longestS}
        return longestS
    }

    println(list.longest())

}