private fun findIndex(arr: Array<Int>, item: Int): Int {
    val result = arr.indexOf(item)
    return result
}

private fun main(args: Array<String>) {
    val array: Array<Int> = arrayOf(1, 5, 9, 7, 3, 2, 4, 8, 6, 10)
    val n = readln().toInt()
    val answer = findIndex(array, n) + 1
    print(answer)
}
