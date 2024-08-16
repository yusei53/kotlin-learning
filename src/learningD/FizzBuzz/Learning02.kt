package learningD.FizzBuzz

fun main(args: Array<String>) {
    for (i in 1..100) {
        val fizz = i % 3 == 0
        val buzz = i % 5 == 0
        val answer = when {
            fizz && buzz -> "FizzBuzz"
            fizz -> "Fizz"
            buzz -> "Buzz"
            else -> i.toString()
        }
        println(answer)
    }
}