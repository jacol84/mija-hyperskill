// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val sides = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    val max = sides.max()!!
    print(if (sides.sum() - max > max) "YES" else "NO")
}