import java.util.*

fun main(args: Array<String>) {
    val map = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)
    val scanner = Scanner(System.`in`)
    print(map[scanner.next()])
}
