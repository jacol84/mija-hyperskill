import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = IntArray(3) { scanner.nextInt() }
    print(a + b == 20 || a + c == 20 || b + c == 20)
}