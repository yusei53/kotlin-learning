package learningD.OutputTwoNumbers

fun main(args: Array<String>) {
    val A = 202
    val B = 134
    val C = 107

    val base = ((A + B) * C)
    val newBase: Double = base.toDouble()
    val exponent = 2.0
    // powはDouble型を期待しDouble型で返すため、最後parseする
    val result = Math.pow(newBase, exponent).toInt()

    print(result)
}