import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = Array(3) { scanner.next() }.map { it[0].toByte() }
    print(b - a == 1 && c - b == 1)
}