fun main() {
    val letter = readLine()!!
    val toLowerCase = letter.toLowerCase()

    val vowels = mapOf("a" to 1, "e" to 5, "i" to 9, "o" to 15, "u" to 21)

    val containsKey = vowels.containsKey(toLowerCase)
    if (containsKey) {
        println(vowels[toLowerCase])
    } else {
        println(0)
    }
}