import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val incomes = IntArray(scanner.nextInt()) { scanner.nextInt() }.map { it * scanner.nextInt() }
    val max = incomes.max()
    print(incomes.indexOf(max) + 1)
}