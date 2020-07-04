import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    for (k in 1..n) {
        val it = k * k
        if (it > n) {
            break
        }
        println(it)
    }
}