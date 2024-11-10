package learningC.arrayPrimer

fun main(args: Array<String>) {
    var twoDimensionalArray = arrayOf<Array<Int>>()

    val array1 = arrayOf(1, 2, 3, 4, 5, 6)
    val array2 = arrayOf(8, 1, 3, 3, 1, 8)

    twoDimensionalArray += array1
    twoDimensionalArray += array2

    // sumOfでラムダ式書いて配列の数分sizeを取得
    val elementCount = twoDimensionalArray.sumOf { array -> array.size }

    println(elementCount)
}