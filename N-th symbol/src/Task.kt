// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    val int = scanner.nextInt()

    print("Symbol # $int of the string \"$line\" is '${line[int-1]}'")
}
