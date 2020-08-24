import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (x, y) = IntArray(2) { scanner.nextInt() }
    val mes = if(y==0) "Division by zero, please fix the second argument!" else x / y
    println(mes)
}

fun solution(A: IntArray): Int {
    return (1..100_000).find { !A.contains(it) }!!
}
x