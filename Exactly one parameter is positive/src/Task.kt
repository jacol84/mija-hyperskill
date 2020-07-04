import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val onlyOneIsPositive = IntArray(3) { scanner.nextInt() }.filter { it > 0 }.count() == 1
    print(onlyOneIsPositive)
    val f: Float = 20.0 + 20.02f // 1
    val l: Long = 10 + 2L        // 2
    val n: Int = l + 5
}

