import java.util.*

fun main() {
  val scanner = Scanner(System.`in`)

  val nextLine = scanner.nextLine()
  val indexOf = nextLine.indexOf("the", ignoreCase = true)

  println(indexOf)
}