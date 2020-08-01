import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while (scanner.hasNext()) {
        list.add(scanner.nextInt())
    }
    val max = list.max()
    print("$max ${list.indexOf(max) + 1}")
}