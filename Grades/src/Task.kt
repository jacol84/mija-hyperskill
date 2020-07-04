import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val map = (1..scanner.nextInt()).map { scanner.nextInt() }.groupingBy { it }.eachCount()
    val result = (2..5).map { map.getOrDefault(it, 0) }.joinToString(separator = " ")
    println(result)
}