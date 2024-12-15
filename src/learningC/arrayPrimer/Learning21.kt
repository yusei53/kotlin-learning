fun main(args: Array<String>) {
    val array: IntArray = intArrayOf(10, 13, 21, 1, 6, 51, 10, 8, 15, 6)
    val target = 6

    val hasTarget = target in array
    if (hasTarget) {
        print("Yes")
    } else {
        print("No")
    }
}