package koans.tutorial

// 名前付き引数
fun joinOptions(options: Collection<String>) = options.joinToString(separator = ", ", prefix = "[", postfix = "]")