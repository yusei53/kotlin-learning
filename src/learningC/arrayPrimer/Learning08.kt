package learningC.arrayPrimer

fun main() {
    val array = arrayOf(
        arrayOf(1),
        arrayOf(2, 3),
        arrayOf(4, 5, 6)
    )

    for (row in array) {
        println(row.size)
    }
}
