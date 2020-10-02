import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val houses = mapOf(
            "gryffindor" to "bravery",
            "hufflepuff" to "loyalty",
            "slytherin" to "cunning",
            "ravenclaw" to "intellect"
    )

    val house = scanner.nextLine()

    if (houses.containsKey(house)) {
        println(houses[house])
    } else {
        println("not a valid house")
    }
}