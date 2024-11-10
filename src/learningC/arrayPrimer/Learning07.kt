package learningC.arrayPrimer

fun main() {
    val array = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(6, 5, 4, 3),
        arrayOf(3, 1, 8, 1)
    )

    val arrayColumnLength = array[0].size
    println(arrayColumnLength)
}
