package LearningFirst.Second

fun main(args: Array<String>) {
    val number = readLine()!!.toInt()
    val text = readLine()!!.split(",")
    for (i in 0..number - 1) {
        println(text[i])
    }
}