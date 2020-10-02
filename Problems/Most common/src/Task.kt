import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val words = mutableMapOf<String, Int>()

    while (true) {
        val word = scanner.nextLine()

        if (word == "stop") {
            if (words.isNotEmpty()) {
                val moreFrequent = words.maxBy { it.value }
                println(moreFrequent?.key)
            } else {
                print(null)
            }
            return
        }

        if (words.containsKey(word)) {
            words.computeIfPresent(word) { _, count -> count + 1 }
        } else {
            words[word] = 1
        }
    }
}