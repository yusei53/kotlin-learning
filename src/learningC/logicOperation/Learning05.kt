package learningC.logicOperation

fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val mockResult = A and B
    val result = 1 - mockResult
    print(result)

    // NAND演算の実装
    // NAND演算は、AND演算の結果を反転させたもの
    // つまり、AND演算の結果が0なら1、1なら0を出力する
}