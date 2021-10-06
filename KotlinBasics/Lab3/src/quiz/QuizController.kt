package quiz

import java.io.File

class QuizController {

    val questions = mutableListOf<Question>()
    val answers = arrayListOf<String>()

    init {
        val lines = File("questions.txt").readLines()
        for(i in 0..lines.size step 5){
            //lines[i] -> kerdes
            val text = lines[i]
            questions.add(text[i],text)


        }
    }

    fun doQuiz(numberOfQuestions: Int){

    }

    fun randomizeQuestions(){

    }

}