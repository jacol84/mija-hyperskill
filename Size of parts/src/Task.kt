import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val result = (1..scanner.nextInt()).map { scanner.nextInt() }.groupingBy { it }.eachCount()
    print("${result.getOrDefault(0, 0)} ${result.getOrDefault(1, 0)} ${result.getOrDefault(-1, 0)}")
}
