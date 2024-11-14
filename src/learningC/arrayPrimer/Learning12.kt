package learningC.arrayPrimer

fun main(args: Array<String>) {
    val n = readln().toInt()
    val n2 = readln().split(" ").map { it.toInt() }
    val result = n2[n - 1]
    print(result)
}