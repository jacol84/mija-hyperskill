import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextDouble()
    val d = ((value.toInt() - value) * -10).toInt()
    print(d)
}