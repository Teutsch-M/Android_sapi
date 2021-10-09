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
            answers.add(lines[i+1])
            answers.add(lines[i+2])
            answers.add(lines[i+3])
            answers.add(lines[i+4])
            val question = Question(text,answers)
            questions.add(question)
            answers.clear()

        }

    }

    fun doQuiz(numberOfQuestions: Int){

        var word : String?
        var correct = 0

        randomizeQuestions()
        for(i in 0..numberOfQuestions){
            println(questions[i].text)
            questions[i].answers.shuffled()
            println(questions[i].answers)
            println("Choose your answer: ")
            word = readLine()

            if(word.equals(rightAns))
                correct++

        }

        println("$correct/$numberOfQuestions")

    }

    fun randomizeQuestions(){

        questions.shuffle()

    }

}