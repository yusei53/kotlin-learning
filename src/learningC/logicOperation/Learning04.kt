package learningC.logicOperation

fun main() {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    // 排他的論理和
    println(A xor B)

    // ビット同士を比較する↓↓
    // ビットが 異なる 場合は 1
    // ビットが 同じ 場合は 0
}