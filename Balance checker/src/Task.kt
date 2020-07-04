import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val total = scanner.nextLine().toInt()
    val list = scanner.nextLine()?.split(" ")?.filter { it.isNotEmpty() }?.map { it.toInt() } ?: emptyList()
    val sum = list.sum()
    val mes = if (total >= sum) {
        "Thank you for choosing us to manage your account! You have ${total - sum} money."
    } else {
        val pairs = (list.indices).map { i -> list[i] to (0..i).sumBy { list[it] } }
        val newSum = pairs.filter { it.second > total }.map { it.first }.sum()
        var index: Int? = null
        pairs.forEachIndexed { inx, pair ->
            if (pair.second <= total) {
                index = inx
            }
        }
        val newTotal = total - (if(index == null) 0 else pairs[index?:0].second)
        "Error, insufficient funds for the purchase. You have $newTotal, but you need $newSum."
    }
    print(mes)
}