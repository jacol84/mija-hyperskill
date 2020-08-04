val intRange = -92..57

data class City(val name: String, val degrees: Int, val default: Int) {
    fun getDeg(): Int = if (degrees in intRange) degrees else default
}

fun main() {
    val cities = arrayOf(
            City("Dubai", readLine()!!.toInt(), 30),
            City("Moscow", readLine()!!.toInt(), 5),
            City("Hanoi", readLine()!!.toInt(), 20)
    )
    val min = cities.minBy { it.getDeg() }?.getDeg()
    val find = cities.filter { it.getDeg() == min }
    val message = if (find.size == 1) find[0].name else "neither"
    print(message)
}