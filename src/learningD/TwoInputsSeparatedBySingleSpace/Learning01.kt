package learningD.TwoInputsSeparatedBySingleSpace

fun main(args: Array<String>) {
    val (text1, text2) = readLine()!!.split(" ")
    println(text1)
    println(text2)

    // https://kotlinlang.org/docs/destructuring-declarations.html
    // val text = readLine()!!.split(" ")
    // println(text.component1())
    // println(text.component2())
}