import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val max = LongArray(scanner.nextInt()) { scanner.nextLong() }.mapIndexed { inde, value -> inde to value }.maxBy { it.second }?.first ?: 0L
    println(max)
}