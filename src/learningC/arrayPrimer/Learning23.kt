fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val row = readln().split(" ").map { it.toInt() }
    if (row.size != n1) throw IllegalArgumentException("this row is not acceptable")
    val target = n2

    val hasTarget = target in row
    if (hasTarget) {
        print("Yes")
    } else {
        print("No")
    }
}