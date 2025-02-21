fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    val (n1, n2) = readln().split(" ").map { it.toInt() }

    list.add(n1, n2)
    list.forEach {
        println(it)
    }
}