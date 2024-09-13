package learningC.dataSetSelection

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }

    val counts = IntArray(10)
    for (i in A) {
        counts[i]++
    }
    print(counts.joinToString(" "))
}