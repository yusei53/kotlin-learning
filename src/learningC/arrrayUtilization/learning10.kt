fun main(args: Array<String>) {
    val n = readln().toInt()
    val mutable = mutableListOf<Int>()
    repeat(n) {
        val m = readln().toInt()
        mutable.add(m)
    }

    val result = mutable.reversed()

    result.forEach {
        println(it)
    }
}
