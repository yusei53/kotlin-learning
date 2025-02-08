fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = List(n1) { readln().toInt() }

    val result = list.indexOf(n2)
    if (result == -1) {
        println(-1)
    } else {
        println(result + 1)
    }
}