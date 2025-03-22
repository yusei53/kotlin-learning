import java.util.*

fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    var list = (1..n1).toMutableList()


    repeat(n2) {
        val result = readln()
        if (result.startsWith("swap")) {
            val x = result.split(" ")[1].toInt()
            val y = result.split(" ")[2].toInt()
            Collections.swap(list, x - 1, y - 1)
        } else if (result == "reverse") {
            list.reverse()
        } else if (result.startsWith("resize")) {
            val num = result.split(" ")[1].toInt()
            if (num < list.size) {
                list = list.subList(0, num)
            }
        }
    }

    list.forEach {
        println(it)
    }
}