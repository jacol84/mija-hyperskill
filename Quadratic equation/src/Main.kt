import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = DoubleArray(3) { scanner.nextDouble() }

    val delta = kotlin.math.sqrt(b * b - 4 * a * c)
    val result1 = -(b + delta) / (2 * a)
    val result2 = -(b - delta) / (2 * a)
    arrayOf(result1, result2).sorted().forEach { print("$it ") }
}