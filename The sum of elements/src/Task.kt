import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val list = mutableListOf<Int>().apply {
        var x=0
        do {
            this += scanner.nextInt()
        } while (scanner.hasNextInt() && (scanner.nextInt() != 0))
    }
    print(list.sum())
}