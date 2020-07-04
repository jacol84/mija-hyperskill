// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val message = (1..4).map { scanner.next() }.map { it.toCharArray()[0] }.map { it.isDigit() }.joinToString(separator = "\\")
    println(message)
}