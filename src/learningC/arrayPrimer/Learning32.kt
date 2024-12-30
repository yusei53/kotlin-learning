fun main(args: Array<String>) {
    val (n1, n2, n3) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    if (list.size != n3) throw IllegalArgumentException("this row is not acceptable")

    val sliceList = list.slice(n1 - 1..n2 - 1)
    sliceList.forEach { element ->
        println(element)
    }
}