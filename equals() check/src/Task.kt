import java.util.Scanner

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }
        other as Client
        return name == other.name && age == other.age
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val client1 = Client(input.next(), input.nextInt(), input.nextInt())
    val client2 = Client(input.next(), input.nextInt(), input.nextInt())
    print(client1 == client2)
}