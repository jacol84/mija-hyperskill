import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberUnit = scanner.nextInt()
    val text = when {
        numberUnit < 1 -> "no army"
        numberUnit in 1..4 -> "few"
        numberUnit in 5..9 -> "several"
        numberUnit in 10..19 -> "pack"
        numberUnit in 20..49 -> "lots"
        numberUnit in 50..99 -> "horde"
        numberUnit in 100..249 -> "throng"
        numberUnit in 250..499 -> "swarm"
        numberUnit in 500..999 -> "zounds"
        numberUnit >= 1000 -> "legion"
        else -> ""
    }
    print(text)
}