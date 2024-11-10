package learningC.arrayPrimer

fun main() {
    // 二次元配列を宣言
    val array = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(8, 1, 3),
        arrayOf(10, 100, 1)
    )

    // 2行目3列目の要素を出力
    println(array[1][2])
}
