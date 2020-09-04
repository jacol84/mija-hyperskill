import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val max = IntArray(4) { scanner.nextInt() }.max()
    print(max)
}