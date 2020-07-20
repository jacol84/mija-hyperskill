import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    do {
        val nextInt = scanner.nextInt()
        list.add(nextInt)
    } while (nextInt != 0)
    print(list.max())
}