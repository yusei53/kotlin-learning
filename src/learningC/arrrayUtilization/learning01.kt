// 自分の得意な言語で
// Let's チャレンジ！！
fun main(args: Array<String>) {
    val (n1, n2) = readln().split(" ").map { it.toInt() }
    val list = List(n1) { readln().toInt() }

//   val mutableList = mutableListOf<Int>()
//   repeat(n1){
//       val n = readln().toInt()
//       mutableList.add(n)
//   }

    val result = list.count { it == n2 }
    println(result)
}