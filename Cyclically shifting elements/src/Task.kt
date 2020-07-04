// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = (1..n).map { scanner.nextInt() }
    val list = mutableListOf(arr.last())
    list.addAll(arr.filterIndexed { ind, value -> arr.lastIndex != ind })
    print(list.joinToString(separator = " ", prefix = "", postfix = ""))
}