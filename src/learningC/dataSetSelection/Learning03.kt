package learningC.dataSetSelection

fun main(args: Array<String>) {
    val N = readLine()!!.split(" ").map { it.toInt() }
    val min = N.min()
    val max = N.max()

    print(max - min)
}