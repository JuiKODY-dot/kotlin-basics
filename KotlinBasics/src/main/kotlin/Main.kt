package org.example
/**
 * Учебный файл по основам Kotlin.
 * Изучаю типы данных, val/var, константы.
 * Создано: 25.06.2026
 */


fun main() {


    var numberOfOrders: Int = 42
    // var изменяема
    val welcomeMessage: String = "Welcome to our app!"
    // val не изменяема

// По умолчанию val и var сами присваивают значение int, string и тп, но можно и самому строго указать его,
// далее его нельзя будет поменять: Int = числа(математика) - var numberOfOrders: Int = 42
//                                  String = текст(в кавычках) - val welcomeMessage: String = "Welcome to our app!"


//    println (numberOfOrders)
    println(welcomeMessage)

    numberOfOrders = 52

    println(numberOfOrders)
// const val - константа, доступная на этапе компиляции.
// Должна быть объявлена на верхнем уровне файла,
// внутри object или companion object.
// НЕЛЬЗЯ объявлять внутри функций.

// целочисленные (числа без суффиксов — это Int)
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long = 1L// 64 bit
    val shortNum: Short = 1.toShort()// 16 bit
    val byteNum: Byte = 1.toByte() // 8 bit
    val unsignedNum: UInt = 2147483647u // 32 bit, 2147483647 точно не отрицательное
// вещественные (дробные, по умолчанию double)
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 836.4F // 32 bit, если указать без явного типа (F-D) присваивается по умолчанию double
// строковые
    val stringValue: String = "Hello world!" // текст заключенный в двойные кавычки
    val charValue: Char = '1' // один любой символ в одинарных кавычках
// логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false

}