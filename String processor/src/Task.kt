import java.util.*

fun main(args: Array<String>) {
    val (text1, command, text2) = Scanner(System.`in`).let { sc -> Array(3) { sc.next()!! } }
    when (command) {
        "equals" -> text1 == text2
        "plus" -> text1 + text2
        "endsWith" -> text1.endsWith(text2)
        else -> "Unknown operation"
    }.run { println(this) }
}
