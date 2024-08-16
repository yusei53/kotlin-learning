package learningD.FortuneTelling

fun main(args: Array<String>) {
    val number = readLine()!!.toInt()
    val correct = 100 >= number

    val answer =
        when {
            correct -> "YES"
            else -> "NO"
        }

    print(answer)
}
