import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()
    val numbers = mutableListOf<Int>()
    repeat(count) {
        numbers.add(scanner.nextInt())
    }

    val n = scanner.nextInt()
    val m = scanner.nextInt()

    val zipWithNext = numbers.zipWithNext { a, b -> a == n && b == m || a == m && b == n }

    val any = zipWithNext.any { it }

    println(if (any) "NO" else "YES")
}