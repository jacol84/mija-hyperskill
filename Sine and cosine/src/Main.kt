import java.util.*
import kotlin.math.cos
import kotlin.math.sin

fun main(args: Array<String>) = Scanner(System.`in`).run { nextDouble() }.let { sin(it) - cos(it) }.let { print(it) }