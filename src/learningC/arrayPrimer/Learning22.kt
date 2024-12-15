fun main(args: Array<String>) {
    val array: IntArray = intArrayOf(5, 12, 6, 84, 14, 25, 44, 3, 7, 20)
    val target = readln().toInt()

    // わんちゃんこれだと計算量多そう
    val hasTarget = target in array
    if (hasTarget) {
        print("Yes")
    } else {
        print("No")
    }
}