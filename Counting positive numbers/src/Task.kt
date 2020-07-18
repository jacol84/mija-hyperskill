import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = IntArray(scanner.nextInt()) { scanner.nextInt() }.filter { it > 0 }.count()
    println(count)
}