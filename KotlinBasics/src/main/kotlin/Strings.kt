package org.example

fun main() {



    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"
    val question = "What's your main question?"
    // конкатенация строк
    println(greeting + "," + space + userName + "!" + space + question )

    // интерполяция строк
    println("$greeting, $userName! $question")
    println("to which you can respond ${40 + 2}")

    val multiString1 = """
                   aaaaaa
         bbbbbbb
                ccccccc
    """.trimIndent()

    val multiString2 = """
                   |aaaaaa
         |bbbbbbb
                |ccccccc
    """.trimMargin()

    println(multiString1)
    println(multiString2)

    val phrase = "And he said - \"it's awesome!\""
    println(phrase)
}