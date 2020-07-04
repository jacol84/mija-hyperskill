// Posted from EduTools plugin
// TODO: provide three functions here
//fun identity(x:Int) = x
//fun half(x:Int) = x/2
//fun zero(x:Int) = 0

fun generate(functionName: String): (Int) -> Int = when(functionName) {
    "identity" -> fun (x) = x
    "half" -> fun (x) = x/2
    else -> fun (x) = 0
}