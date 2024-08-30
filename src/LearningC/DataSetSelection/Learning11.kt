package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }

    // 可変のMapを作成
    val productList = mutableMapOf<String, Int>()

    repeat(n1) {
        val (product, price) = readLine()!!.split(" ")
        productList[product] = price.toInt()
    }

    repeat(n2) {
        val product = readLine()!!
        println(productList[product] ?: -1)
    }
}