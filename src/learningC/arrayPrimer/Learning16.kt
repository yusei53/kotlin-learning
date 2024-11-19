package learningC.arrayPrimer

fun main(args: Array<String>) {
    val n = readln().toInt()
    val mutableList = mutableListOf<List<Int>>()

    repeat(n) {
        val row = readln().split(" ").map { it.toInt() }
        if (row.size != 5) {
            throw IllegalArgumentException("this row is not acceptable")
        }
        mutableList.add(row)
    }

    mutableList.forEach { list ->
        println(list.joinToString(" "))
    }
}