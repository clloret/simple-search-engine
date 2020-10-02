import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val template = "You have chosen a %s"
    val response = when (scanner.nextInt()) {
        1 -> template.format("square")
        2 -> template.format("circle")
        3 -> template.format("triangle")
        4 -> template.format("rhombus")
        else -> "There is no such shape!"
    }
    println(response)
}