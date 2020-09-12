import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val arr = Scanner(System.`in`).run { DoubleArray(3) { nextDouble() } }
    val p = arr.sum() / 2
    println((p * arr.map { p - it }.reduce { acc, i -> acc * i }).pow(0.5))
}