// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val l = IntArray(3).map { scanner.next() }
    print("${l[0].first()}. ${l[1]}, ${l[2]} years old")
}