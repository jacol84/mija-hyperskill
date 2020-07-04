import java.util.*

fun main(args: Array<String>) {
    val (a, b, h) = Scanner(System.`in`).let { scanner -> IntArray(3) { scanner.nextInt() } }
    when {
        h > b -> "Excess"
        h < a -> "Deficiency"
        else -> "Normal"
    }.also { print(it) }

}