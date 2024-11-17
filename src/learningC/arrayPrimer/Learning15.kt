package learningC.arrayPrimer

fun main(args: Array<String>) {
    val n = readln().toInt()
    val list = mutableListOf<List<Int>>()

    repeat(5) {
        val row = readln().split(" ").map { it.toInt() }
        if (row.size != n) {
            throw IllegalArgumentException("this row is not acceptable")
        }
        list.add(row)
    }

    list.forEach { array ->
        println(array.joinToString(" "))
    }
}