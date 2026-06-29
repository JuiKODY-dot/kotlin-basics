package org.example

fun main() {

    val userAge = readln().toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        println("Show special content")
    } else if (userAge == 16 || userAge ==17){
        println("Show limited content")
    } else {
        println("Back to main screen")
    }
    println(resultText)

    val consoleNumber = when(userAge){
        10 -> {
            println("Additional action")
            "you're 10"}
        20 -> "you're 20"
        42 -> "you're 42"
        else -> "another number"
    }
    println(consoleNumber)
}


const val AGE_OF_MAJORITY = 18