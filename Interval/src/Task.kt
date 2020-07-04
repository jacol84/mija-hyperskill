import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    print(if (number > -15 && number <= 12 || number > 14 && number < 17 || number >= 19) "True" else "False")
}