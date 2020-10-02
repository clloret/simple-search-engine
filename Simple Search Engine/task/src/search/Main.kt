package search

import java.util.*

enum class Strategy {
    ALL, ANY, NONE
}

fun main(args: Array<String>) {

    if(args.isEmpty()){
        print("Please add some command line arguments")
        return
    }
    print("Args ${args[0]}")

    val scanner = Scanner(System.`in`)

    // Enter the number of people
    val count = numberOfPeople(scanner)

    // Enter all people
    val people = allPeople(count, scanner)

    val invertedIndex = createInvertedIndex(people)

    do {
        printMenu()
        val option = scanner.nextInt()
        when (option) {
            1 -> searchPeople(scanner, people, invertedIndex)
            2 -> printAllPeople(people)
            0 -> {}
            else -> println("Incorrect option! Try again.")
        }
    } while (option != 0)
}

private fun createInvertedIndex(people: List<String>): Map<String, List<Int>> {
    val map: MutableMap<String, MutableList<Int>> = mutableMapOf()

    people.forEachIndexed { index, s ->
        s.trim().splitToSequence(' ').forEach { word ->
            val toLowerCase = word.toLowerCase()
            if (!map.containsKey(toLowerCase)) {
                map[toLowerCase] = mutableListOf(index)
            } else {
                val positions = map[toLowerCase]
                positions?.add(index)
            }
        }
    }

    return map
}

private fun printMenu() {
    println("=== Menu ===")
    println("1. Find a person")
    println("2. Print all people")
    println("0. Exit")
}

fun printAllPeople(people: List<String>) {
    println("=== List of people ===")
    people.forEach { println(it) }
}

private fun searchPeople(scanner: Scanner, people: List<String>, invertedIndex: Map<String, List<Int>>) {
    println("Select a matching strategy: ALL, ANY, NONE")
    val strategy = scanner.nextLine()

    println("Enter a name or email to search all suitable people.")
    scanner.nextLine()

    val data = scanner.nextLine()
    val toLowerCase = data.toLowerCase()
    if (invertedIndex.containsKey(toLowerCase)) {
        println("Found people:")

        val positions = invertedIndex[toLowerCase]
        positions?.forEach {
            val person = people[it]
            println(person)
        }
    } else {
        println("No matching people found.")
    }
}

private fun numberOfSearchQueries(scanner: Scanner): Int {
    println("Enter the number of search queries:")
    val queries = scanner.nextInt()
    scanner.nextLine()
    return queries
}

private fun allPeople(count: Int, scanner: Scanner): List<String> {
    println("Enter all people:")    
    val people = mutableListOf<String>()
    repeat(count) {
        people.add(scanner.nextLine())
    }
    return people
}

private fun numberOfPeople(scanner: Scanner): Int {
    println("Enter the number of people:")
    val count = scanner.nextInt()
    scanner.nextLine()
    return count
}
