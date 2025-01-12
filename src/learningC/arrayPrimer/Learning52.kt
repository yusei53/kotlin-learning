package learningC.arrayPrimer

import kotlin.math.abs

fun getDistance(x: Int, y: Int): Int {
    val x = abs(2 - x)
    val y = abs(3 - y)
    return x + y
}

fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = List(n) { readln().split(" ").map { it.toInt() } }

    list.forEach { (x, y) ->
        val answer = getDistance(x, y)
        println(answer)
    }
}