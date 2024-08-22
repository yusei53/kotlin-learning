package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val n1 = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    val n2 = readLine()!!.toInt()
    val B = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until n2) {
        println(A[B[i] - 1])
    }

}