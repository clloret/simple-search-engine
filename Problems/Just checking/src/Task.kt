import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }

    val n = scanner.nextInt()
    val m = scanner.nextInt()

    for (index in array.indices) {
        if (index == array.count() - 1) {
            println("NO")
            return
        }

        val current = array[index]
        val next = array[index + 1]
        if (current == n && next == m || current == m && next == n) {
            println("YES")
            return
        }
    }
}