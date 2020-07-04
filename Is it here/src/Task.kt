import java.util.*

fun main(args: Array<String>) = Scanner(System.`in`).let { scanner -> IntArray(scanner.nextInt()) { scanner.nextInt() }.contains(scanner.nextInt()) }.run { print(if (this) "YES" else "NO") }


open class Transport(val cost: Int) {
    open fun getFullInfo(): String = "$$cost cost"

    fun getTax(): String = "$${(cost * 0.25).roundToInt()} tax"
}

open class WaterTransport(cost: Int, val color: String) : Transport(cost) {
    open fun getColorInfo(): String = "$color color"

    fun getWaterTax(): String = "$${(cost * 0.3).roundToInt()} tax"

    override fun getFullInfo(): String = "$$cost cost, $color color"
}