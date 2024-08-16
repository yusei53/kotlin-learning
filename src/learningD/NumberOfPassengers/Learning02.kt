package learningD.NumberOfPassengers

fun main(args: Array<String>) {
    // 配列として受け取り、それぞれInt型に変換
    val (number1, number2, number3) = readLine()!!.split(" ").map{number ->
        number.toInt()
    }

    val result = number1 * number2 % number3
    print(result)

}