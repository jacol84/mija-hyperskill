import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, n) = LongArray(3) { scanner.nextLong() }
    print((a..b).filter { it % n == 0L }.count())
}