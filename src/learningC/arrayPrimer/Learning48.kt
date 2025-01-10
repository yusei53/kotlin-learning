fun main(args: Array<String>) {
    val list = listOf(1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4).distinct().sorted()
    list.forEach {
        println(it)
    }
}