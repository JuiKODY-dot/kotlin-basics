package org.example

fun main() {
    // ========== ДИАПАЗОНЫ ==========
    val range1: IntRange = 42..442                 // от 42 до 442 включительно
    val range2: IntRange = 42 until 442            // от 42 до 441 (442 исключено)
    val range3: ClosedFloatingPointRange<Float> = 42f..422f
    val range4: CharRange = 'a'..'z'               // все буквы от a до z
    val range5: ClosedRange<Double> = 42.1..422.1
    val range6: ClosedRange<Float> = 42.1f..422.1f
    val range7: IntProgression = 442 downTo 42 step 2  // от 442 до 42 с шагом 2

    // ========== ПРОВЕРКА ВХОЖДЕНИЯ ==========
    val a = 52 in range1   // true (52 есть в диапазоне)
    val b = 52 !in range1  // false
    println("52 in 42..442: $a")
    println("52 not in 42..442: $b")

    // ========== ЦИКЛ FOR С BREAK ==========
    for (i in 5 downTo 1) {
        if (i == 3) {
            println("User pressed 'skip button'")
            break  // выходим из цикла
        }
        println("AD will end in $i")
        Thread.sleep(1000)
    }
    println("App keep working\n")

    // ========== ЦИКЛ FOR С CONTINUE ==========
    for (i in 5 downTo 1) {
        if (i == 3) {
            println("Skipping $i")
            continue  // пропускаем i = 3
        }
        println("Number: $i")
    }
}