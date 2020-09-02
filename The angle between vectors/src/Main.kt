import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val (x1, y1, x2, y2) = IntArray(4) { scanner.nextInt() }
    val uv = x1 * x2 + y1 * y2
    val uabs = Math.sqrt((x1*x1 + y1*y1).toDouble())
    val vabs = Math.sqrt((x2*x2 + y2*y2).toDouble())
    val zzz = uv/(uabs* vabs)
    print(zzz)
}