package learningC.dataSetSelection

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val firstList = readLine()!!.split(" ").map { it.toInt() }
    val secondList = readLine()!!.split(" ").map { it.toInt() }

    // listの結合
    val joinedList = firstList + secondList
    // 重複を削除してソート
    val correctList = joinedList.toSet().sorted()
    print(correctList.joinToString(" "))
}