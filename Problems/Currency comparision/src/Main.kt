import java.util.Scanner

enum class Countries(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar")
}

fun isCountry(country: String) : Boolean {
    for (enum in Countries.values()) {
        if (country == enum.name) return true
    }
    return false
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val firstCountry = input.next()
    val secondCountry = input.next()

    if (!isCountry(firstCountry)) {
        print(false)
        return
    }
    if (!isCountry(secondCountry)) {
        print(false)
        return
    }

    println(Countries.valueOf(firstCountry).currency == Countries.valueOf(secondCountry).currency)
}