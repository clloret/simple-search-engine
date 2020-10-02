import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val chr = scanner.next().single()

    if (chr == '0') {
        println(false)
    } else {
        println(chr.isDigit() || chr.isUpperCase())
    }
}