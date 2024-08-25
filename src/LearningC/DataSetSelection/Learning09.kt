package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val S: List<Char> = readLine()!!.toList()

    // アルファベットってASCIIコードで数値として計算できるのか。。
    val counts = IntArray(26)
    for (i in S) {
        counts[i - 'a']++
    }

    print(counts.joinToString(" "))
}