//Условие:
//Гагарин провёл в космосе `6480` секунд.
//Нужно перевести это время в формат `часы:минуты:секунды` с ведущими нулями.


fun main() {

    val totalSeconds = 6480
    val hours1 = totalSeconds / 3600
    val minutes1 = (totalSeconds % 3600) / 60
    val seconds1 = totalSeconds % 60


    val seconds2 = seconds1.toString().padStart(2, '0')
    val hours2 = hours1.toString().padStart(2, '0')
    val minutes2 = minutes1.toString().padStart(2, '0')

    println("$hours2:$minutes2:$seconds2")
}