import java.util.*

fun swapper(list: List<Int>, n1: Int, n2: Int) {
    return Collections.swap(list, n1 - 1, n2 - 1)
}

fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = List(n) { readln().toInt() }
    val (x, y) = readln().split(" ").map { it.toInt() }

    val result = swapper(list, list[x], list[y])
    print(result)
}