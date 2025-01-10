fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val min = list.min()
    val max = list.max()
    println("${max} ${min}")
}