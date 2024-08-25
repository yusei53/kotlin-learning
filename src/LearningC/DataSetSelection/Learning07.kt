package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val (n1, n2, n3, n4) = readLine()!!.split(" ").map { it.toInt() }
    val mass = List(n1) { readLine()!! }
    val selectedMass = mass[n3 - 1][n4 - 1]
    val result = when (selectedMass) {
        '#' -> "Yes"
        else -> "No"
    }
    println(result)
}
