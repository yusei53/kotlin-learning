package test

fun main() {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }
    print(A[n2 - 1])
}