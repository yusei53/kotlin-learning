fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }

    val average = list.average()

    val sorted = list.filter { it >= average }.joinToString("\n")
    println(sorted)
}