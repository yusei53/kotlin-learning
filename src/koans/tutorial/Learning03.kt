package koans.tutorial

// 文字列リテラル
const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    question = "$question"
    answer = $answer""".trimIndent()

fun main() {
    println(tripleQuotedString.trimMargin("#"))
}