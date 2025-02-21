import java.util.*

fun swapper(list: MutableList<Int>, n1: Int, n2: Int) {
    Collections.swap(list, n1 - 1, n2 - 1)
}

fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    val (x, y) = readln().split(" ").map { it.toInt() }

    swapper(list, x, y)

    list.forEach { println(it) }
}