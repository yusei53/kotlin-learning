// FIXME: refactor
fun main(args: Array<String>) {
    val n = readln().toInt()
    val base = readln().split(" ").map { it.toInt() }
    val mutableList = mutableListOf<List<Int>>()
    repeat(n) {
        val list = readln().split(" ").map { it.toInt() }
        mutableList.add(list)
    }


    val maxScore = mutableListOf<Int>()
    for (i in mutableList.indices) {
        val resultList = base.zip(mutableList[i]) { x, y -> x * y }
        val sumScore = resultList.sum()
        maxScore.add(sumScore)
    }

    println(maxScore.max())

}