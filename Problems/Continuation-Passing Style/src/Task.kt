
fun square(value: Int, context: Any, continuation: (Int, Any) -> Unit) {
    continuation.invoke(value * value, context)
}