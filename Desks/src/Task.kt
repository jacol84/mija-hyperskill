import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(IntArray(3) { scanner.nextInt() }.map { (it + 1) / 2 }.sum())
}