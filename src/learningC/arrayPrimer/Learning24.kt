fun findIndex(arr: Array<Int>, item: Int): Int {
    val result = arr.indexOf(item)
    return result
}

fun main(args: Array<String>) {
    val array: Array<Int> = arrayOf(1, 10, 2, 9, 3, 8, 4, 7, 5, 6)
    val answer = findIndex(array, 8) + 1
    print(answer)
}