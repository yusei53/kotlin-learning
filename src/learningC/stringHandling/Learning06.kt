fun main(args: Array<String>) {
    val n1 = readln().toInt()
    val n2 = readln().toInt()

    val keyValue = mutableMapOf<Int, String>()
    repeat(n2) {
        val (pos, char) = readln().split(" ")
        keyValue[pos.toInt()] = char
    }

    val defaultChar = readln()

    (1..n1).forEach { i ->
        if (i in keyValue) {
            print(keyValue[i])
        } else {
            print(defaultChar)
        }
    }
}
