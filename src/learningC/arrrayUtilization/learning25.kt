fun main() {
    val (n, k, f) = readln().split(" ").map { it.toInt() }
    val queue = MutableList(k) { readln().toInt() }
    val result = queue.drop(f).distinct()

    result.forEach { println(it) }
}
