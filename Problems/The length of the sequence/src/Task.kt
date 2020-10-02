import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var count = 0
    do {
        val n = scanner.nextInt()
        if (n !=0) {
            count++
        }
    } while (n != 0)

    println(count)
}