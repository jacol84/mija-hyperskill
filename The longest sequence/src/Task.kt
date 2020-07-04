// Posted from EduTools plugin
import java.util.*
import java.util.concurrent.atomic.AtomicLong

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val max = scanner.nextInt()
    val arr = (1..max).map { scanner.nextInt() }
    val result = mutableListOf<AtomicLong>()
    arr.forEachIndexed { index, value -> if (index == 0 || value < arr[index - 1]) result.add(AtomicLong(1)) else result.last().incrementAndGet() }

    print(result.map { it.get() }.max())
}