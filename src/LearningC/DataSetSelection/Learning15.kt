package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    for (i in 1 until n) {
        // subListで指定した範囲のリストを返す
        val specificList = list.subList(0, i)
        if (specificList.contains(list[i])) {
            println("Yes")
        } else {
            println("No")
        }
    }
}