// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (h, mi, s) = Triple(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    val (d, mo, y) = Triple(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    print("$h:$mi:$s $d/$mo/$y")
}