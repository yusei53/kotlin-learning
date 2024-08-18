package LearningD.OutputTwoNumbers

fun main(args: Array<String>) {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    print(n1 + n2)
}