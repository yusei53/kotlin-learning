fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = List(n) { readln().toInt() }

    println(list.sum())
}