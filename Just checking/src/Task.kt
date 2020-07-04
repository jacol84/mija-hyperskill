import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = Array(scanner.nextInt()) { scanner.nextInt() }
    val (n, m) = Array(2) { scanner.nextInt() }
    val list = array.mapIndexed{ index, value ->        ((value == n && array.getOrNull(index + 1) == m) || (value == m && array.getOrNull(index + 1) == n))
    }.filter { it }
    val messages = if (list.isNotEmpty()) "YES" else "NO"
    print(messages)
}