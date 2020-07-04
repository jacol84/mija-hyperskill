fun main() {
    val tax = readLine()!!.let { mapOf("headphones" to 1.11, "smartphone" to 1.15, "tv" to 1.17, "laptop" to 1.19).getOrDefault(it, 1.0) }
    val price = readLine()!!.toInt().also { if (it !in 0..1_000_000) throw IllegalArgumentException("price[$it] !in 0..1_000_000") }
    val product = Product(tax, price)
    println(totalPrice(product))
}

private fun totalPrice(product: Product) = (product.price * product.tax).toInt()

data class Product(val tax: Double, val price: Int)


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(IntArray(scanner.nextInt()) { scanner.nextInt() }.filter { it % 4 == 0 }.max())
}