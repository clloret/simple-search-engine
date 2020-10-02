data class Block(val color: String) {
    object DimProperties {
        var length: Int = 0
        var width: Int = 0

        fun blocksInBox(length: Int, width: Int): Int {
            return length / this.length * (width / this.width)
        }
    }
}
