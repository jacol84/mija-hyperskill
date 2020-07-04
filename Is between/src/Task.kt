// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()
    val intRange = if (n2 > n3) n3..n2 else n2..n3
    val message = n1 in intRange
    println(message)
}