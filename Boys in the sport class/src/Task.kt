import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (h1, h2, h3) = IntArray(3) { scanner.nextInt() }
    print(h2 in h1..h3 || h2 in h3..h1)
}