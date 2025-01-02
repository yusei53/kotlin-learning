fun countSelectedNumber(list: List<Int>, selectedNumber: Int): Int {
    val result = list.groupBy { it }
    return result[selectedNumber]?.size ?: 0
}

fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    println(countSelectedNumber(list, n2))
}