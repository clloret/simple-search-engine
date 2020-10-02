import java.util.*

fun main() {
  val scanner = Scanner(System.`in`)

  val nextLine = scanner.nextLine()
  val split = nextLine.split(" ")
  val max = split.maxBy { s -> s.length }

  println(max)
}