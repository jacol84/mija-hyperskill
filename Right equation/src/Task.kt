// Posted from EduTools plugin
import java.util.*

// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}

fun isRightEquation(a: Int, b: Int, c: Int): Any? {
    return  a * b == c
}
