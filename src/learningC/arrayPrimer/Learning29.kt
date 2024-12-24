fun countNumber(arr: List<Int>, item: Int): Int {
    val counts = arr.groupBy { it }
    val result = counts[item]?.size ?: 0
    return result
}

fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val row = readln().split(" ").map { it.toInt() }
    if (row.size != n2) throw IllegalArgumentException("this row is not acceptable")

    val answer = countNumber(row, n1)
    print(answer)
}