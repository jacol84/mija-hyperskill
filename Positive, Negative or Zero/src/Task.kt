// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    print(if (n1 > 0) "positive" else if (n1 < 0) "negative" else "zero")
}