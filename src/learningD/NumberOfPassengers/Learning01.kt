package learningD.NumberOfPassengers

fun main(args: Array<String>) {
    // 配列として受け取り、それぞれInt型に変換
    val (number1, number2) = readLine()!!.split(" ").map{number ->
        number.toInt()
    }

    val D = number1 - number2
    val P = number1 * number2
    print("${D} ${P}")

}