import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println((1..scanner.nextLong()).map { scanner.nextLong() }.min())
}
