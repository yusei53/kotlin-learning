fun main(args: Array<String>) {
    val n = readln().toInt()
    val queue = ArrayDeque<Int>()

    repeat(n) {
        val result = readln()
        if (result.startsWith("in")) {
            val num = result.split(" ")[1].toInt()
            queue.add(num)
        } else if (result == "out") {
            if (queue.isNotEmpty()) {
                queue.removeFirst()
            }
        }
    }

    queue.forEach {
        println(it)
    }
}