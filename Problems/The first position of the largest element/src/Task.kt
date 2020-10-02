import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numbers = mutableListOf<Int>()
    do {
        val n = scanner.nextInt()
        numbers.add(n)
    } while (scanner.hasNextInt())

    val max = numbers.max()
    val indexOf = numbers.indexOf(max) + 1
    println("$max $indexOf")
}