package kotlinProgrammingBook.chapter14

open class Room(val name: String) {
    protected open val dangerLevel = 5
    fun description() = "Room: $name\nDanger level: $dangerLevel"

    open fun load() = "You are in the $name."
}

fun main(args: Array<String>) {
    val room = Room("Castle")
    println(room.description())
    println(room.load())

}

open class TownSquare : Room("Town Square") {
    override val dangerLevel = super.dangerLevel - 3
    final override fun load() = "The villagers rally and cheer as you enter!"
}