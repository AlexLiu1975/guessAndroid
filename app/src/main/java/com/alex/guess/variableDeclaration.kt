package com.alex.guess

fun main() {

    // val (不可變)
    val languageName : String = "kotlin"
    println(languageName)
    println(languageName.toUpperCase())

    // var (可變的)
    var count : Int = 0
    count = 42
    println(count)

    if (count == 42) {
        println("I have the answer.")
    } else {
        println("The answer eludes me.")
    }

    //

    val answerString1: String =
        if (count == 42) {
            "I have the answer."
        } else if (count > 35) {
            "The answer is close."
        } else {
            "The answer eludes me."
        }

    println(answerString1)

    //

    val answerString2 = when {
        count == 42 -> "I have the answer."
        count > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }

    println(answerString2)

    val answerString3 = when {
            count == 42 -> "I have the answer."
            count > 35 -> "The answer is close."
            else -> "The answer eludes me."
        }
    println(answerString3)

    //

    val languageName1: String? = null
    if (languageName1 != null) {
        // No need to write languageName?.toUpperCase()
        println(languageName1.toUpperCase())
    }
}