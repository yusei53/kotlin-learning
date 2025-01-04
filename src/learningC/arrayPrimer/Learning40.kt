fun main(args: Array<String>) {
    val (n1, n2, n3) = readln().split(" ").map { it.toInt() }
    val mutableList = readln().split(" ").map { it.toInt() }.toMutableList()

    mutableList.add(n2 - 1, n3)
    mutableList.forEach {
        println(it)
    }
}