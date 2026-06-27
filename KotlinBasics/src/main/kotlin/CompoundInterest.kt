import kotlin.math.pow

fun main() {
    val principal = 70000.0
    val rate = 0.167
    val years = 20
    val n = 1 // начисляется в конце года = 1 раз в год
    // A = P * (1 + r)^n
    // Ожидаемый ответ: 1536438.428

    val result = principal * (1 + rate / n).pow(n * years)
    val formatted = String.format("%.3f", result)
    println(formatted)
}