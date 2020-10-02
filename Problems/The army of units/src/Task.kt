import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.nextInt()) {
        in Int.MIN_VALUE..0 -> println("no army")
        in 1..4 -> println("few")
        in 5..9 -> println("several")
        in 10..19 -> println("pack")
        in 20..49 -> println("lots")
        in 50..99 -> println("horde")
        in 100..249 -> println("throng")
        in 250..499 -> println("swarm")
        in 500..999 -> println("zounds")
        else -> println("legion")
    }
}