fun main(args: Array<String>) {
    val n = readln().toInt()
    val fibonacci = mutableListOf(0, 1)

    for (i in 2 until n) {
        fibonacci.add(fibonacci[i - 2] + fibonacci[i - 1])
    }

    fibonacci.forEach {
        println(it)
    }
}