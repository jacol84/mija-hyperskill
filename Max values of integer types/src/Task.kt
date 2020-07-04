// Posted from EduTools plugin
fun main(args: Array<String>) {
    val listOf = listOf(Int.MAX_VALUE, Long.MAX_VALUE, Byte.MAX_VALUE, Short.MAX_VALUE)
    listOf.map { it.toString().toLong() }.sorted().forEach { println(it) }
}