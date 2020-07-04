class Application(val name: String) {
    fun run(strings: Array<String>) {
        println(name)
        strings.forEach { println(it) }
    }
}