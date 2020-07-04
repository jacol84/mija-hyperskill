// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val message = when (scanner.next()) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    }
    print(message)
}