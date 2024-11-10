package learningC.arrayPrimer

fun main() {
    val array = arrayOf(
        arrayOf(6, 5, 4, 3, 2, 1),
        arrayOf(3, 1, 8, 8, 1, 3)
    )

    for (row in array) {
        println(row.joinToString(" "))
    }
}
