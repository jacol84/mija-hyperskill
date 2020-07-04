// Posted from EduTools plugin
import java.util.*

enum class BOX { BOX1, BOX2, EQ }

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val box1 = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).sorted()
    val box2 = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).sorted()

    val result = box1.mapIndexed { idx, value -> if (value == box2[idx]) BOX.EQ else if (value > box2[idx]) BOX.BOX1 else BOX.BOX2 }

    val message = when {
        result.count { it == BOX.EQ } == 3 -> "Box 1 = Box 2"
        result.count { it == BOX.EQ || it == BOX.BOX1 } == 3 -> "Box 1 > Box 2"
        result.count { it == BOX.EQ || it == BOX.BOX2 } == 3 -> "Box 1 < Box 2"
        else -> "Incomparable"
    }
    print(message)
}