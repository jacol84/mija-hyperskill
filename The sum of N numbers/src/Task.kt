import java.util.*

fun main(args: Array<String>) = Scanner(System.`in`).let { my -> IntArray(my.nextInt()) { my.nextInt() } }.sum().run { print(this) }