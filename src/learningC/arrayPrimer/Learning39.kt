fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }.toMutableList()

    list.removeAt(n2 - 1)
    list.forEach {
        println(it)
    }
}