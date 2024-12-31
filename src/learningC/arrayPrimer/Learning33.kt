fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list1 = readln().split(" ").map { it.toInt() }
    val list2 = readln().split(" ").map { it.toInt() }

    val resultList = list1 + list2

    resultList.forEach { element ->
        println(element)
    }
}