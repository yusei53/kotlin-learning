fun main(args: Array<String>) {
    val (n1, n2, n3, n4) = readln().split(" ").map { it.toInt() }
    val mutableList = mutableListOf<List<Int>>()

    repeat(n1) {
        val row = readln().split(" ").map { it.toInt() }
        if (row.size !== n2) throw IllegalArgumentException("this row is not acceptable")
        mutableList.add(row)
    }

    print(mutableList[n3 - 1][n4 - 1])
}