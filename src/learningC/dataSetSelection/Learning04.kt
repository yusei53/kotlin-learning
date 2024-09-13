package learningC.dataSetSelection

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val numberList = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    repeat(n2) {
        val result = readLine()!!.split(" ").map { it.toInt() }
        when (result[0]) {
            0 -> numberList.add(result[1])
            1 -> numberList.removeLast()
            2 -> println(numberList.joinToString(" "))
        }
    }
}