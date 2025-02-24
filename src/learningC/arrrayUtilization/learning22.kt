fun main(args: Array<String>) {
    val (x, y, z) = readln().split(" ").map { it.toInt() }

    val mutableList = mutableListOf<Int>()
    repeat(x) {
        val score = readln().toInt()
        mutableList.add(score)
    }

    mutableList.removeIf { it <= y }
    val result = mutableList.size - z
    if (result > 0) {
        println(result)
    } else {
        println(0)
    }
}