package learningC.dataSetSelection

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val numberList = readLine()!!.split(" ").map { it.toInt() }

    // すでに見た要素を管理するSet
    val seenNumbers = mutableSetOf<Int>()

    for (i in 1 until n) {
        if (seenNumbers.contains(numberList[i])) {
            println("Yes")
        } else {
            println("No")
        }
        // 現在の要素をSetに追加
        seenNumbers.add(numberList[i - 1])
    }
}

// 下はO(n^2)だが、上はO(n)になる
// 下はループごとにリストの部分リストを作成するため、計算量が増える(O(n^2))
// 上はSetを使っているため、各要素に対してO(1)でアクセスできる

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val list = readLine()!!.split(" ").map { it.toInt() }
//    for (i in 1 until n) {
//        // subListで指定した範囲のリストを返す
//        val specificList = list.subList(0, i)
//        if (specificList.contains(list[i])) {
//            println("Yes")
//        } else {
//            println("No")
//        }
//    }
//}