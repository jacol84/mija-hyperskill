// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = (1..n).map { scanner.nextInt() }
    val m = scanner.nextInt()
    val sum = arr.sumBy { if (it == m) 1 else 0 }
    print(sum)
}