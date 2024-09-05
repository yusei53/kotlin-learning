package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val n1 = readLine()!!
    val resultList = readLine()!!.split(" ")
    val n2 = readLine()!!.toInt()
    val numberList = readLine()!!.split(" ").map { it.toInt() }
    for (i in numberList) {
        println(resultList[i - 1])
    }
}