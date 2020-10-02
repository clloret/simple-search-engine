import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }

    var count = 0
    for (index in array.indices) {
        if (index > 0 && index < array.count() - 1) {
            val first = array[index - 1]
            val second = array[index]
            val third = array[index + 1]

            if (first + 1 == second && second + 1 == third) {
                count++
            }
        }
    }

    println(count)
}