package learningC.arrayPrimer

fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val n3 = readln().split(" ").take(n1).map { it.toInt() }
    val result = n3[n2 - 1]
    print(result)
}