package dictionary

import java.io.File

object ListDictionary: IDictionary {

    val words = mutableListOf<String>()

    init {
        //beolvasni es hozzaadni
        File(IDictionary.fileName).readLines().forEach{add(it)}

    }

    override fun add(word: String): Boolean {
        if(find(word))
            return false
        words.add(word)

        return true
    }

    override fun find(word: String): Boolean {
        return (words.contains(word))
    }

    override fun size(): Int {
        return words.size
    }


}