// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    (scanner.nextInt()..scanner.nextInt()).map {
        when {
            it % 5 == 0 && it % 3 == 0 -> "FizzBuzz"
            it % 5 == 0 -> "Buzz"
            it % 3 == 0 -> "Fizz"
            else -> it.toString()
        }
    }.forEach { println(it) }
}