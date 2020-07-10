import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`).next()
    val a = ('a'..'z').filter { !input.contains(it) }.joinToString("")
    println(a)
}