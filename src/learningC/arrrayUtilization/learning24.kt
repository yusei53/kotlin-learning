fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = List(n) { readln().toInt() }.sorted()

    val bestPair = list.zipWithNext().minByOrNull { (x, y) -> y - x }
    bestPair?.let { (x, y) ->
        println(x)
        println(y)
    }
}