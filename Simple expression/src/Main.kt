import java.util.*

fun main() {
    val (a, b, c, d) = Scanner(System.`in`).let { sc -> Array(4) { sc.nextBigInteger() } }
    println(-a * b + c - d)
}