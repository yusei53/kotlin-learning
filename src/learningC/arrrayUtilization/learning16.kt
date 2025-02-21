fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    val n1 = readln().toInt()

    list.removeAt(n1 - 1)
    list.forEach {
        println(it)
    }
}