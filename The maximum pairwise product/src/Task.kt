import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val quest = IntArray(scanner.nextInt()) { scanner.nextInt() }.mapIndexed{ index, value -> index to value }


    val flatMap = quest.flatMap { lhsElem -> quest.filter { it.first != lhsElem.first}.map { rhsElem ->  lhsElem.second to rhsElem.second } }
            .map { it.first * it.second }.max()
    print(if(quest.size==1)quest[0].second else flatMap)
}