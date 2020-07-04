import java.util.*

// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val (hei, len1, len2, wit) = IntArray(4) { input.nextInt() }
    println(Box(hei, len1, wit))
    println(Box(hei, len2, wit))
}