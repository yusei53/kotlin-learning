fun main() {
    val pinPositions = listOf(
        listOf(10, 9, 8, 7),
        listOf(6, 5, 4),
        listOf(3, 2),
        listOf(1)
    ).flatten()

    val pins = List(4) { readln().split(" ").map { it.toInt() } }.flatten()

    val remain = pinPositions.mapIndexedNotNull { index, value ->
        if (pins[index] == 1) value else null
    }

    val min = remain.minOrNull() ?: 1
    println(min)
    println(remain.size)
}