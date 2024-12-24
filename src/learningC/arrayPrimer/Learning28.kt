fun countNumber(arr: Array<Int>, item: Int): Int {
    val counts = arr.groupBy { it }
    val result = counts[item]?.size ?: 0
    return result
}

fun main(args: Array<String>) {
    val item = readln().toInt()
    val array = arrayOf(1, 2, 5, 1, 4, 3, 2, 5, 1, 4)
    val answer = countNumber(array, item)
    print(answer)
}