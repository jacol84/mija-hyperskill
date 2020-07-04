// Posted from EduTools plugin
import java.util.Scanner

fun isVowel(letter: Char): Any? = letter.toUpperCase() in listOf('A', 'E', 'I', 'O', 'U')

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

        println(isVowel(letter))
}
