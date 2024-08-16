package learningD.FortuneTelling

fun main(args: Array<String>) {
    val text = readLine()
    val answer =
        when (text) {
            "paiza" -> "YES"
            else -> "NO"
        }

    print(answer)
}
