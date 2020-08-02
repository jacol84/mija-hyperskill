import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (x, y, z) = IntArray(3) { scanner.nextInt() }
    print(!(x == y || y == z || x == z))
}