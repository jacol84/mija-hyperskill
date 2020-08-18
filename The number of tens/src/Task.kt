import java.util.Scanner

fun main(args: Array<String>) {
    val ten = Scanner(System.`in`).next().reversed().getOrElse(1) { '0' }
    print(ten)
}