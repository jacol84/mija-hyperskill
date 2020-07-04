// Posted from EduTools plugin
import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println()

    val message = when (scanner.next()) {
        "rectangle" -> rectangle(scanner)
        "circle" -> circle(scanner)
        "triangle" -> triangle(scanner)
        else -> null
    }
    print(message)
}

fun circle(scanner: Scanner): Double {
    val r = scanner.nextInt()
//    val pi = Math.PI
    val pi = 3.14
    return pi * r * r
}

fun triangle(scanner: Scanner): Double {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val p = (a + b + c) / 2.0
    return sqrt(p * (p - a) * (p - b) * (p - c))

}

fun rectangle(scanner: Scanner): Int {
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    return a * b
}
