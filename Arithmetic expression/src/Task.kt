// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val map = IntArray(2).map { scanner.nextInt() }
    print("${map[0]} plus ${map[1]} equals ${map.sum()}")
}