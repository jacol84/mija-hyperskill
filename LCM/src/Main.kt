fun main() {
    val (a, b) = Array(2) { readLine()!!.toBigInteger() }
    print(a * b / a.gcd(b))
}