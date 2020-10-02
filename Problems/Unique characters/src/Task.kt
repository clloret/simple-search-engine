import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()
    val count = word.groupingBy { it }.eachCount().filterValues { it == 1 }.count()

    println(count)
}
