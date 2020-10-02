import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val f = arrayListOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val t = arrayListOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val p = arrayListOf(1, 10, 100, 1000, 10_000, 100_000)

    when (scanner.nextInt()) {
        in f -> println("F")
        in t -> println("T")
        in p -> println("P")
        else -> println("N")
    }
}
