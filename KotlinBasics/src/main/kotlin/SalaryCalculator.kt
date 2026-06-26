/**
 * Задача: Средний балл по английскому
 *
 * Условие: В классе 4 ученика с оценками: 3, 4, 3, 5.
 * Нужно вычислить средний балл и вывести его с 2 знаками после запятой.
 */

fun main() {


    val numberOfEngLern: Float = 4f
    val a = 3
    val b = 4
    val c = 3
    val d = 5

    //     println(numberOfEngLern)

    var allCount = 0
    allCount = (a+b+c+d)
    //     println(allCount)
    //     println(allCount::class.java.simpleName)

    var middleCount: Float = 0f
    middleCount = allCount / numberOfEngLern
    //     println(middleCount)
    //     println(middleCount::class.java.simpleName)

    val formatted = String.format("%.2f", middleCount)
    println(formatted)
}