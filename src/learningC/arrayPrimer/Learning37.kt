fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }.toMutableList()
    list.add(n2)

    list.forEach {
        println(it)
    }
}