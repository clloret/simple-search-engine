import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val numbers = mutableListOf<Int>()
    repeat(n) {
        numbers.add(scanner.nextInt())
    }
    val m = scanner.nextInt()
    println(if (numbers.contains(m)) "YES" else "NO")
}