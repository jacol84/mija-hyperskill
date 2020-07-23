import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val pair = scanner.nextInt() to scanner.nextInt()
    val pairs = arrayOf(pair, pair.second to pair.first)
    val result = array.mapIndexed { ind, v -> v to array.getOrNull(ind + 1) }
            .any { it in pairs }
    print(if (result) "NO" else "YES")
}