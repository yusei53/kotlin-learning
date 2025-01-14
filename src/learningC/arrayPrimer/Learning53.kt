fun getDistance(x1: Int, y1: Int, x2: Int, y2: Int): Int {
    val x = Math.abs(x1 - x2)
    val y = Math.abs(y1 - y2)
    return x + y
}

fun main(args: Array<String>) {
    val n = readln().split(" ").map { it.toInt() }

    val pointList = List(n[0]) {
        readln().split(" ").map { it.toInt() }
    }

    val (x1, y1) = pointList[n[1] - 1]
    val (x2, y2) = pointList[n[2] - 1]

    println(getDistance(x1, y1, x2, y2))
}