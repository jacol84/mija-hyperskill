fun main() {
    val rooms = readLine()!!
    val price = readLine()!!
    val house = House(rooms.toInt(), price.toInt())
    println(totalPrice(house))
}

fun totalPrice(house: House): Int {
    val value = when {
        house.rooms <= 1 -> 1.0
        house.rooms in 2..3 -> 1.2
        house.rooms == 4 -> 1.25
        house.rooms in 5..7 -> 1.4
        else -> 1.6
    }
    val price = if (house.price > 0) house.price else 0
    return (price * value).toInt()
}

class House(val rooms: Int, val price: Int) {}