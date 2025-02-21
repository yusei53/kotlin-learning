fun main(args: Array<String>) {

    for (i in 1..9) {
        val result = (1..9).joinToString(" ") { (i * it).toString() }
        println(result)
    }

//    for (i in 1..9) {
//        for (j in 1..9) {
//            print("${i * j} ")
//        }
//        println()
//    }
}