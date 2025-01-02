package kotlinProgrammingBook.chapter5

fun main(args: Array<String>) {
    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to the game, $playerName! (copyright $currentYear)"
    }
}

// 無名関数を使って文字列を返すが、波括弧の後に()をつけることで即時実行する
//fun main(args: Array<String>) {
//    println({
//        val currentYear = 2018
//        "Welcome to the game! (copyright $currentYear)"
//    }())
//}

// 無名関数を変数に代入して、その変数を呼び出す。returnは省略できる
//fun main(args: Array<String>) {
//    val greetingFunction: () -> String = {
//        val currentYear = 2018
//        "Welcome to the game! (copyright $currentYear)"
//    }
//
//    println(greetingFunction())
//}

//fun main(args: Array<String>) {
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to the game, $playerName! (copyright $currentYear)"
//    }
//    runSimulation("Guyal", greetingFunction)
//}

//fun main(args: Array<String>) {
//    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to the game, $playerName! (copyright $currentYear)"
//    }
//}
//
//inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last()
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}
//
//fun printConstructionCost(numBuildings: Int) {
//    val cost = 500
//    println("construction cost: ${cost * numBuildings}")
//}

