// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val s = scanner.next()
    val b = scanner.nextLong()
    val message = when {
        s == "+" -> a + b
        s == "-" -> a - b
        s == "*" -> a * b
        s == "/" && b == 0L -> "Division by 0!"
        s == "/" -> a / b
        else -> "Unknown operator"
    }
    print(message)
}