fun main(args: Array<String>) {
    val (x, y) = readln().split(" ").map { it.toInt() }
    val list = MutableList(x) { readln().toInt() }
    val result = list.filter { it >= y }

    result.forEach {
        println(it)
    }
}