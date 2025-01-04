package kotlinProgrammingBook.chapter6

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }
    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e: UnskilledSwordJugglerException) {
        println(e)
    }
    println("You juggle $swordsJuggling swords!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
//    swordsJuggling ?: throw UnskilledSwordJugglerException()
    checkNotNull(swordsJuggling) { "Player cannot juggle swords" }
}

class UnskilledSwordJugglerException() : IllegalStateException("Player cannot juggle swords")