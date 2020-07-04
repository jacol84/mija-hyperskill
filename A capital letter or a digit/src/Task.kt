// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c = scanner.next().first()
    val range = ('1'..'9') + ('A'..'Z')
    print(c in range)
}