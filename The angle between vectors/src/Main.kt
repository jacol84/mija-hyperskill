import java.util.Scanner
import kotlin.math.acos
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    val (x1, y1, x2, y2) = IntArray(4) { scanner.nextInt() }
    val uv = x1 * x2 + y1 * y2
    val uabs = sqrt((x1 * x1 + y1 * y1).toDouble())
    val vabs = sqrt((x2 * x2 + y2 * y2).toDouble())
    val res = uv / (uabs * vabs)
    println(floor(Math.toDegrees(acos(res))))
}