import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val result = sqrt(sqrt(scanner.nextDouble()))
    print(result)
}