// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val b1 = if (scanner.nextBoolean()) 15..25 else 10..20
    println(n1 in b1)
}
