import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val message = if (array.sortedArray().contentEquals(array)) "YES" else "NO"
    println(message)
}