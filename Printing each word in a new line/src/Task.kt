// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    IntArray(5).map { scanner.next() }.forEach { println(it) }
}
