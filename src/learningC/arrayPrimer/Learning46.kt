fun main(args: Array<String>) {
    val list = readln().split(" ")
    val result = list.sorted()
    result.forEach {
        println(it)
    }
}