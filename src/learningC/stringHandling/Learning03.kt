package learningC.stringHandling

fun main(args: Array<String>) {
    val dateTime = readln().split(" ")
    val dateParts = dateTime[0].split("/")
    val timeParts = dateTime[1].split(":")

    val year = dateParts[0]
    val month = dateParts[1]
    val date = dateParts[2]
    val hour = timeParts[0]
    val minutes = timeParts[1]

    println(year)
    println(month)
    println(date)
    println(hour)
    println(minutes)
}