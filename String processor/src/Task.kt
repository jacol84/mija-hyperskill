import java.util.*

fun main(args: Array<String>) {
    val (x, command, z) = Scanner(System.`in`).let { sc -> Array(3) { sc.next()!! } }
    when (command) {
        "equals" -> x == z
        "plus" -> x + z
        "endsWith" -> x.endsWith(z)
        else -> "Unknown operation"
    }.run { println(this) }
}