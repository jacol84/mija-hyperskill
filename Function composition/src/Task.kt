// Posted from EduTools plugin
fun composition(value: Int, y: (Int) -> Int, g: (Int) -> Int): Int = y(g(value))