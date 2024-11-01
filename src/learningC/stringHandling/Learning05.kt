package learningC.stringHandling

fun main(args: Array<String>) {
    val s = readln()
    val result = s.toList().distinct().joinToString("")
    print(result)
}