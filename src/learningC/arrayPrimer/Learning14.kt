package learningC.arrayPrimer

fun main(args: Array<String>) {
    val twoDimensionalArray = arrayOf(
        intArrayOf(1, 3, 5, 7),
        intArrayOf(8, 1, 3, 8)
    )

    twoDimensionalArray.forEach { array ->
        println(array.joinToString(" "))
    }
}