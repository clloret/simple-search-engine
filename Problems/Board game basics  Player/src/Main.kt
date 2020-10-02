class Player(val id: Int, val name: String, val hp: Int) {
  companion object {
    fun create(name: String): Player {
      return Player(name.hashCode(), name, 100)
    }
  }
}