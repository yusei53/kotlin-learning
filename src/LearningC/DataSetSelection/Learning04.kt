package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    repeat(n2) {
        val query = readLine()!!.split(" ").map { it.toInt() }
        when (query[0]) {
            0 -> list.add(query[1])
            1 -> list.removeLast()
            2 -> println(list.joinToString(" "))
        }
    }
}