fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val sorted = list.filter { it >= 5 }.joinToString("\n")
    println(sorted)
}