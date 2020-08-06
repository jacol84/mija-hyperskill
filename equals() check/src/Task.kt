import java.util.*

data class Client(val name: String, val age: Int) {
    var balance: Int = 0
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val client1 = Client(input.next(), input.nextInt()).also { it.balance = input.nextInt() }
    val client2 = Client(input.next(), input.nextInt()).also { it.balance = input.nextInt() }
    print(client1 == client2)
}