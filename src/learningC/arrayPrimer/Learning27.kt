fun countSelectedElement(arr: Array<Int>, element: Int): Int {
    val counts = arr.groupBy { it }
    // count = [1: [1, 1, 1, 1, 1, 1], 2: [2, 2, 2, 2]]
    val result = counts[element]?.size ?: 0
    return result
}

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 2, 1, 2, 1, 2, 1, 1, 1)
    val answer = countSelectedElement(array, 1)
    print(answer)
}