import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (x1, y1, x2, y2) = IntArray(4) { scanner.nextInt() }
    val message = when {
        x1 == x2 -> "YES"
        y1 == y2 -> "YES"
        abs(x1 - x2) == abs(y1 - y2) -> "YES"
        else -> "NO"
    }
    println(message)
}