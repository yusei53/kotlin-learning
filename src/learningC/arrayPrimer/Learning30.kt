fun replaceValue(defaultNumber: Int, selectedNumber: Int, replaceNumber: Int): Int {
    return if (defaultNumber == selectedNumber) replaceNumber else defaultNumber
}

fun main(args: Array<String>) {
    val (selectedNumber, replaceNumber, rowSize) = readln().split(" ").map { it.toInt() }
    val row = readln().split(" ").map { it.toInt() }
    if (row.size != rowSize) throw IllegalArgumentException("this row is not acceptable")

    val newRow = row.map { replaceValue(it, selectedNumber, replaceNumber) }
    newRow.forEach { item ->
        println(item)
    }
}