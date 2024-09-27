package learningC.logicOperation

fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    val mockResult = A xor B
    val result = 1 - mockResult
    print(result)

    // XNOR演算の実装
    // XNOR演算は、XOR演算の結果を反転させたもの
    // つまり、XOR演算の結果が0なら1、1なら0を出力する

    // XORとは、ビットの比較のことで、ビットが異なる場合は1、同じ場合は0を出力する
}