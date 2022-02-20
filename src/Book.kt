class Book (override val price: Double, override val wordCount: Int) : IPublication {
    override fun getType(): String {
        return when {
            wordCount in  1..1000 ->"Flash Fiction"
            wordCount in 1001..7500 -> "Short Story"
            wordCount <=0 -> throw IllegalArgumentException("Incorrect count")
            else -> "Novel"
        }
    }

    override fun equals(other: Any?): Boolean {
        return other is Book && other.price == this.price && other.wordCount == this.wordCount
    }


}