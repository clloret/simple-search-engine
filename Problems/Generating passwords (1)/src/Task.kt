import java.util.*

// write your answer here

    fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val n = scanner.nextInt()

    val uppers = ('A'..'Z').toList()
    val lowers = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()

    val sb = StringBuilder()
    var prevChar = ' '

    for (i in 1..a) {
        val ch = getNewChar(uppers, prevChar)
        prevChar = ch
        sb.append(ch)
    }

    for (i in 1..b) {
        val ch = getNewChar(lowers, prevChar)
        prevChar = ch
        sb.append(ch)
    }

    for (i in 1..c) {
        val ch = getNewChar(numbers, prevChar)
        prevChar = ch
        sb.append(ch)
    }

    if (sb.count() < n) {
        val rest = n - sb.count()
        for (i in 1..rest) {
        val ch = getNewChar(uppers, prevChar)
        prevChar = ch
        sb.append(ch)
        }
    }

    println(sb.toString())
    }

    private fun getNewChar(list: List<Char>, prevChar: Char): Char {
    var ch: Char
    do {
        ch = list.random()
    } while (prevChar == ch)
    return ch
    }
