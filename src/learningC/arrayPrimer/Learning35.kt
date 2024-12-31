fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }

    val answer = list.reversed()
    answer.forEach {
        println(it)
    }
}