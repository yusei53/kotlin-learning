package test

fun main() {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    if (n1 == 0 && n2 == 0) {
        print(0)
    } else {
        print(1)
    }

    // ビット演算の論理演算子orでもいける
    // print(n1 or n2)
}