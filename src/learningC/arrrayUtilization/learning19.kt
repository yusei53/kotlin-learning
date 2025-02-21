fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = List(n) { readln().toInt() }
    val distinct = list.distinct()
    distinct.forEach {
        println(it)
    }
}