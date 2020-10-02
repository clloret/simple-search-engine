import java.util.Scanner

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun isRainbow(color: String) : Boolean {
    for (enum in Countries.values()) {
        if (color.toUpperCase() == enum.name) return true
    }
    return false
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val color = input.nextLine()

    println(isRainbow(color))
}