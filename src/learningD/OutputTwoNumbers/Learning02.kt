package learningD.OutputTwoNumbers

fun main(args: Array<String>) {
    val data = 813
// dataを文字列に変換後、forEachが文字列をChar型だと認識し期待する出力になる
    data.toString().forEach{number ->
        println(number)
    }
}