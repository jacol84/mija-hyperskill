import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    fun get(): Int = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt() * 1
    val time1 = get()
    val time2 = get()
    print(time2 - time1)
}