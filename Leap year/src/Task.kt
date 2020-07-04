// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()
    print( if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) "Leap" else "Regular")
}
