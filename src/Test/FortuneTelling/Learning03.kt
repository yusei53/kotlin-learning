package learningD.FortuneTelling

fun main(args: Array<String>) {
    val (number1, number2, number3) = readLine()!!.split(" ").map { number -> number.toInt() }
    val base = number1 * number2
    val correct = base <= number3

    val answer =
        when {
            correct -> "YES"
            else -> "NO"
        }

    print(answer)
}
