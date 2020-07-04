// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = (1..n).map { scanner.nextInt() }
    val rotation = scanner.nextInt() % n
    val list = (0 until n).map { (n + it - rotation) % n }.map { arr[it] }
    print(list.joinToString(separator = " ", prefix = "", postfix = ""))
}