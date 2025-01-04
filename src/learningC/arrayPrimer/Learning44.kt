fun main(args: Array<String>) {
    val (n1, n2, n3) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ")
    val value = list[n1 - 1]
    val answer = value.substring(n3 - 1, n3)
    println(answer)
}