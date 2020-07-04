// Posted from EduTools plugin
import java.util.Scanner

fun sum(vararg a: Int) = a.sum()

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}

