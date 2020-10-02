import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextLine()
    val half = number.length / 2

    val first = number.take(half).sumBy { Character.getNumericValue(it) }
    val second = number.takeLast(half).sumBy { Character.getNumericValue(it) }

    if (first == second) {
        println("YES")
    } else {
        println("NO")
    }
}
