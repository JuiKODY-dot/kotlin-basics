package org.example

fun main() {
    // Логические операторы
    val userAge = 42
    val isAdultAndNotRetired = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    val isWorkingAge = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE // короче, чем вариант выше

    println("User age: $userAge")
    println("Is adult and not retired: $isAdultAndNotRetired")
    println("Is in working age (18-65): $isWorkingAge")

    val a: Boolean = true
    val b: Boolean = !a
    println("Not true = $b")
}

const val RETIREMENT_AGE = 65
const val AGE_OF_MAJORITY = 18