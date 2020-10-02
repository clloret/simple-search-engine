fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid number of program arguments")
        return
    }

    args.forEachIndexed { index, s ->
        processArgument(s, index + 1)
    }
}

fun processArgument(s: String, n: Int) {
    val chars = s.length
    println("Argument $n: $s. It has $chars characters")
}