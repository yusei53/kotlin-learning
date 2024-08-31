package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val stringList1 = List(n1) { readLine()!! }
    val stringList2 = List(n2) { readLine()!! }

    for (s in stringList2) {
        // indexOfは引数に与えられたものがない場合-1を返す
        val index = stringList1.indexOf(s)
        if (index == -1) {
            println(-1)
        } else {
            println(index + 1)
        }
    }

}