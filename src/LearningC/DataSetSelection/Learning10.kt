package LearningC.DataSetSelection

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val StringArray = mutableListOf<String>()

    repeat(N) {
        StringArray.add(readLine()!!)
    }

    // コレクションをグループ化して、各要素の出現回数をカウント
    val groupList = StringArray.groupingBy { it }.eachCount()

    // グループ化したリストの要素をkeyでソート
    val sortGroupList = groupList.toSortedMap()

    // Map型なのでkey-valueを引数に取ることができる
    sortGroupList.forEach { (key, value) ->
        println("$key $value")
    }

}