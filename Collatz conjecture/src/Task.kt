import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()
    val list = mutableListOf<Int>()
    while (n > 1) {
        list.add(n)
        n = if (n % 2 == 0) n / 2 else n * 3 + 1
    }
    list.add(1)
    print(list.joinToString(" "))
}