import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c, d) = Array(4) { scanner.nextLong() }
    (0..1000).filter { a * it * it * it + b * it * it + c * it + d == 0L }.forEach { println(it) }
}