import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (x, y) = DoubleArray(2) { scanner.nextDouble() }
    print(Math.pow(x, y))
}