package dates


import java.util.Calendar

val now = Calendar.getInstance()

data class Date(val year: Int = now.get(Calendar.YEAR) , val month: Int = now.get(Calendar.MONTH)+1, val day: Int = now.get(Calendar.DAY_OF_MONTH)): Comparable<Date>{

    override fun compareTo(other: Date): Int {
        return comp.compare(this,other)
    }

    companion object{
        val comp = Comparator.comparingInt<Date> {it.year}. thenComparingInt { it.month }. thenComparingInt { it.day }
    }

}

fun Date.isLeap(): Boolean{
    if(this.year % 4 == 0) {
        if (this.year % 100 == 0) {
            if (this.year % 400 == 0)
                return true
            return false
        }
        return true
    }
    return false
}


fun Date.isValid(): Boolean {

 if(this.year <= 0 || this.month <= 0 || this.month > 12 || this.day <= 0 )
     return false

if (this.month == 2)
    if (this.isLeap() && this.day > 29 || (!this.isLeap() && this.day > 28))
        return false

 if(this.month < 8){
     if(this.month % 2 != 0 && this.day > 31 || (this.month % 2 == 0 && this.day > 30))
             return false
 }
 else if(this.month % 2 == 0 && this.day > 31 || (this.month % 2 != 0 && this.day > 30))
     return false


 return true

}