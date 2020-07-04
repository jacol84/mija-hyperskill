// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var factorial: Long = 1
    (a until b).forEach { factorial *= it.toLong() }
    print(factorial)
}