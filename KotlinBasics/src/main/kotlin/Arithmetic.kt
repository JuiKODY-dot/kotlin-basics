package org.example

fun main() {

    val a = 5
    val b = 7
    val sum =a + b


    println(sum)

    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2)
    // Делит целые числа, получает целые числа

    val floatNum1: Float = 10.0f
    val floatNum2: Float = 3.0f
    println(floatNum1 / floatNum2)
    // Делит десятичные числа, получает десятичные числа

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)
    // Делит десятичные числа, получает десятичные числа.
    // В отличие от float(32 bit) у Double больший размер (64 bit) - возможно другое значение

    val complexExpression: Int = (sum) * 2 - 4 / 2
    println(complexExpression)

    println(10 % 3)
    // находит остаток от делимого числа(здесь - 10), можно определять четный-нечетный
    println(10 % 2)




    val f = intNum1 / floatNum1
    println(f::class.java.simpleName) //float

    // int / int = int
    // int / float = дробное(float)
    // float / float = float
    // float / double = double
    // double>float>int

    val f1 = intNum1 / floatNum1 / doubleNum1
    println(f1::class.java.simpleName) //double

    // Double (64 bit) точнее, чем Float (32 bit).
    // Поэтому 10.0 / 3.0 даст более точный результат (3.3333333333333335),
    // чем 10.0f / 3.0f (3.3333333)

    //::class.java.simpleName заменяет получаемый ответ на вывод типа данных

    // инкремент, декремент
    var counter: Int = 0

    counter = counter + 1
    counter += 1
    counter++

    println(counter)

    counter = counter - 1
    counter -= 1
    counter--

    println(counter)

    // операторы сравнения
    //  a = 5, b = 7

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)
    // ответы даются в виде типа boolean, false / true
}