package learningC.arrayPrimer

fun main() {
    val array = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(10, 100, 0, 5),
        arrayOf(8, 1, 3, 8),
        arrayOf(15, 34, 94, 25)
    )

    val (n1, n2) = readln().split(" ").map { it.toInt() }

    println(array[n1 - 1][n2 - 1])
}
