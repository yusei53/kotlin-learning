package learningC.stringHandling

fun main(args: Array<String>) {
    val s = readln()
    if (s.toDoubleOrNull() == null) {
        print("NO")
    } else {
        print("YES")
    }
}