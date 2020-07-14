import java.util.*

fun main(args: Array<String>) {
    val n = Scanner(System.`in`).nextInt()
    val list = (1..n).flatMap { f -> (1..f).map { f } }.filterIndexed { index, _ -> index < n }
    print(list.joinToString(" "))
}