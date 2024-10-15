package learningC.stringHandling

fun main(args: Array<String>) {
    val string = readln().split("/")
    val year = string[0]
    val month = string[1]
    val date = string[2]

    val time = string[3].split(":")
    val hour = time[0]
    val minute = time[1]

    println(year)
    println(month)
    println(date)
    println(hour)
    println(minute)
}