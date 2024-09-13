package learningC.logicOperation

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    if (n1 == 1 && n2 == 1) {
        print(1)
    } else {
        print(0)
    }

    // ビット演算の論理演算子andでもいける
    // print(n1 and n2)
}