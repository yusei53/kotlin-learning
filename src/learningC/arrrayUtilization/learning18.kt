fun main(args: Array<String>) {
    val (size, newSize) = readln().split(" ").map { it.toInt() }
    val listA = List(size) { readln().toInt() }
    val isMoreThanListA = newSize > size
    val listB = listA.take(newSize)

    if (isMoreThanListA) {
        val rest = listB.size - size
        listB.forEach {
            println(it)
        }
        repeat(rest) {
            println(0)
        }
    } else {
        listB.forEach {
            println(it)
        }
    }
}