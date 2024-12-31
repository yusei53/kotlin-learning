fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val sortedList = list.sorted()

    sortedList.forEach { element ->
        println(element)
    }
}