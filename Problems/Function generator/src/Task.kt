fun identity(n: Int): Int {
  return n
}

fun half(n: Int): Int {
  return n / 2
}

fun zero(n: Int): Int {
  return 0
}

fun generate(functionName: String): (Int) -> Int =
        when (functionName) {
          "identity" -> ::identity
          "half" -> ::half
          "zero" -> ::zero
          else -> ::zero
        }
