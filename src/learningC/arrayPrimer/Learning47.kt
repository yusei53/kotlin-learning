fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ")
    val sorted = list.sorted()
    println(sorted[n2 - 1])
}