import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }

    val count = array.mapIndexed { index, value ->
        val b1 = value + 1 == array.getOrNull(index + 1)
        val b2 = value + 2 == array.getOrNull(index + 2)
        if (b1 && b2) 1 else 0
    }.sum()
    print(count)
}