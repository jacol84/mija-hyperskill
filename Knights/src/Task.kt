import java.lang.Math.abs
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (x1, y1, x2, y2) = IntArray(4) { scanner.nextInt() }
    val pair = abs(x1 - x2) to abs(y1 - y2)
    val mes = if (1 to 2 == pair || 2 to 1 == pair) "YES" else "NO"
    print(mes)
}