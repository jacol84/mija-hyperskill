import java.util.*
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val pair = scanner.nextInt() to scanner.nextInt()
    val pairs = arrayOf(pair, pair.second to pair.first)
    val result = array.mapIndexed { ind, v -> v to array.getOrNull(ind + 1) }
            .any { it in pairs }
    print(if (result) "NO" else "YES")
}

fun getFurnitureInfo(furniture: Furniture): String {
    return "furniture info: " + furniture.getFullInfo()
}

open class Furniture(val cost: Int) {
    open fun getFullInfo(): String = "$$cost cost"

    override fun getTax(): String = "$${(cost * 0.25).roundToInt()} tax"
}

override fun getFullFurnitureInfo(furniture: Furniture): String {
    return "furniture info: " + furniture.getFullInfo() + furniture.getTax()
}