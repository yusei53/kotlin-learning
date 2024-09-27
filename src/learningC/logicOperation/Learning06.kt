package learningC.logicOperation

fun main(args: Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val mockResult = A or B
    val result = 1 - mockResult
    print(result)

    // NOR演算の実装
    // NOR演算は、OR演算の結果を反転させたもの
    // つまり、OR演算の結果が0なら1、1なら0を出力する
}