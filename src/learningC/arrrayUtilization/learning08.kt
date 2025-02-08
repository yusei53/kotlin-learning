fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = List(n) { readln().toInt() }

    val setSize = list.toSet().size
    print(setSize)
}