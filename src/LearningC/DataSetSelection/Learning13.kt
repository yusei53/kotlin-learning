package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val numberList = readLine()!!.split(" ").map { it.toInt() }
    val hasSpecificNumber = numberList.contains(n2)
    print(if (hasSpecificNumber) "Yes" else "No")
}