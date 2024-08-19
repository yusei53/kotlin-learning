package LearningC.StandardOutput

fun main(args: Array<String>) {
    // 10個の標準出力をリストに格納し、それを一つの文字列に変換かつ1要素ごとにスペースを挿入
    val result = List(10) { readLine()!! }.joinToString(" ")
    print(result)
}