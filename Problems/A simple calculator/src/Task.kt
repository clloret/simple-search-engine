import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextLong()
    val operator = scanner.next()
    val n2 = scanner.nextLong()

    when (operator) {
        "+" -> println(n1 + n2)
        "-" -> println(n1 - n2)
        "/" -> {
            if (n2 != 0L) {
                println(n1 / n2)
            } else {
                println("Division by 0!")
            }
        }
        "*" -> println(n1 * n2)
        else -> println("Unknown operator")
    }
}
