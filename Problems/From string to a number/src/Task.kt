import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numbers = mapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
    )
    val nextLine = scanner.nextLine()

    println(numbers[nextLine])
}