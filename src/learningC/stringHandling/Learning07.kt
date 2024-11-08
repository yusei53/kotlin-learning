package learningC.stringHandling

fun main() {
    val input = readLine() ?: return
    println(formatNumber(input))
}

fun formatNumber(s: String): String {
    val firstDotIndex = s.indexOf('.')
    val cleanedDots = if (firstDotIndex != -1) {
        val beforeDot = s.substring(0, firstDotIndex)
        val afterDot = s.substring(firstDotIndex + 1).replace(".", "")
        "$beforeDot.$afterDot"
    } else {
        s
    }

    val parts = cleanedDots.split(".")

    var integerPart = parts[0].replaceFirst("^0+".toRegex(), "")
    if (integerPart.isEmpty()) integerPart = "0"

    if (parts.size == 1) {
        return integerPart
    }

    val decimalPart = parts[1].replace("0+$".toRegex(), "")

    // 小数部が空になった場合は整数部分のみ返す
    return if (decimalPart.isEmpty()) {
        integerPart
    } else {
        "$integerPart.$decimalPart"
    }
}