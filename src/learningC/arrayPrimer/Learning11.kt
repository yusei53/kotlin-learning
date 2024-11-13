package learningC.arrayPrimer

fun main() {
    val array = arrayOf(1, 3, 5, 4, 6, 2, 1, 7, 1, 5)
    val n = readln().toInt()
    val result = array[n - 1]
    print(result)
}
