package learningC.dataSetSelection

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val S: List<Char> = readLine()!!.toList()
    // val charList = readLine()!!.toCharArray()

    // アルファベットってASCIIコードで数値として計算できるのか。。
    val counts = IntArray(26)
    for (i in S) {
        counts[i - 'a']++
        // counts[97 - 97]++
    }

    print(counts.joinToString(" "))
}