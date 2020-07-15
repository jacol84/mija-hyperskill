import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val sum = scanner.next().toCharArray().map { it.toString().toInt() }.sum()
    print(sum)
}