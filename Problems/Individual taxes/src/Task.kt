import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val incomes = IntArray(size)
    val taxes = IntArray(size)

    for (i in 0..incomes.lastIndex) {
        incomes[i] = scanner.nextInt()
    }

    for (i in 0..taxes.lastIndex) {
        taxes[i] = scanner.nextInt()
    }

    var position = 0
    var max = 0
    for (index in incomes.indices) {
        val result = incomes[index] * taxes[index]
        if (max == 0 || result > max) {
            max = result
            position = index
        }
    }

    println(position + 1)
}