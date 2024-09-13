package learningC.dataSetSelection

fun main(args: Array<String>) {
    val (n1, n2, n3, n4) = readLine()!!.split(" ").map { it.toInt() }
    val roadList = List(n1) { readLine()!! }
    val road = roadList[n3 - 1][n4 - 1]
    val result = if (road == '#') "Yes" else "No"
    print(result)
}
