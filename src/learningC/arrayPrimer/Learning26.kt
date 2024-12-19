private fun findIndex(arr: Array<Int>, index: Int): Int {
    return arr.indexOf(index)
}

fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val array = readln().split(" ").map { it.toInt() }.toTypedArray()
    if (array.size != n2) throw IllegalArgumentException("this row is not acceptable")

    val result = findIndex(array, n1) + 1
    print(result)
}