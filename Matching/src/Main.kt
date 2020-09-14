fun main() =
        println(Array(3) { readLine()!!.toBigInteger() }.groupBy { it }.map { it.value.size }.max().let { if (it == 1) 0 else it })
