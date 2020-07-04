// Posted from EduTools plugin
import java.util.*
import kotlin.math.abs

fun getLastDigit(a: Int): Any? = abs(a % 10)

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}
