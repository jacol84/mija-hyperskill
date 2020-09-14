import java.math.BigInteger

val exabyte: BigInteger = BigInteger("2").pow(63)
fun main() = println(exabyte.multiply(readLine()!!.toBigInteger()))