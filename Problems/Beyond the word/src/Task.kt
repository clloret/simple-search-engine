import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()

    val sb = StringBuilder()
    for (ch in 'a'..'z') {
        if (word.contains(ch)) {
            continue
        }
        sb.append(ch)
    }
    println(sb.toString())
}