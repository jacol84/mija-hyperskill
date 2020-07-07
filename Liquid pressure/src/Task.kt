import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    (DoubleArray(2) { scanner.nextDouble() }.reduce { it2, it1 -> it2 * it1 } * 9.8).also { print(it) }
}