fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val mutableList = mutableListOf<List<Int>>()

    repeat(3) {
        val row = readln().split(" ").map { it.toInt() }
        if (row.size !== 3) throw IllegalArgumentException("this row is not acceptable")
        mutableList.add(row)
    }

    print(mutableList[n1 - 1][n2 - 1])
}