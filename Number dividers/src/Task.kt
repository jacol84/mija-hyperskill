import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    listOf(2L, 3L, 5L, 6L).filter { n % it == 0L }.forEach { println("Divided by $it") }
}