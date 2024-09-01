package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val numberList = readLine()!!.split(" ").map { it.toInt() }
    val cleanNumberList = numberList.distinct().joinToString(" ")
    print(cleanNumberList)
}