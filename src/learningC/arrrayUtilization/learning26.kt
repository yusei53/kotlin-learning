fun main(args: Array<String>) {
    val list = List(4) { readln().split(" ").map { it.toInt() } }.flatten()
    val result = list.mapIndexedNotNull { index, value -> if (value == 1) index + 1 else null }

    println(result.min())
    println(result.size)
}