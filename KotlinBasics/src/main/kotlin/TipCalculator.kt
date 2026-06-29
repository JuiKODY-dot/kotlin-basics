package org.example

/*
 * Задача: Калькулятор чаевых
 * Что должна делать программа:
 * 1. Запросить у пользователя сумму счета (целое число).
 * 2. Запросить оценку качества обслуживания (варианты: "awesome", "good", "bad").
 * 3. Рассчитать чаевые в зависимости от оценки:
 *    - "awesome" → 20% от суммы счета
 *    - "good"    → 15% от суммы счета
 *    - "bad"     → 5% от суммы счета
 * 4. Вывести в консоль:
 *    - Сумму чаевых
 *    - Итоговую сумму (счет + чаевые)
 *
 * Дополнительное требование:
 * Если пользователь ввел не число (например "abc"), программа должна вывести
 * сообщение об ошибке и завершиться без краша.
 *
 * Пример работы программы:
 * How much money did you spend?
 * 1000
 * Rate our quality of service (awesome/good/bad):
 * awesome
 * Your tips: 200
 * Final price: 1200
 */

fun main() {
    println("How much money you spent?")
    val moneyInput = readln()
    val money = moneyInput.toIntOrNull()

    if (money == null) {
        println("Error: Please enter a valid number")
        return
    }

    println("Rate our quality of service (awesome/good/bad)")
    val quality = readln()

    val tips = when (quality) {
        "awesome" -> money * 20 / 100
        "good" -> money * 15 / 100
        "bad" -> money * 5 / 100
        else -> {
            println("Unknown rating, tips = 0")
            0
        }
    }

    val finalPrice = tips + money
    println("Final price: $finalPrice")
}