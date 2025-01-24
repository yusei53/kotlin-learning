fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = List(n1) { readln().toInt() }

    if (list.contains(n2)) println("Yes") else println("No")
}