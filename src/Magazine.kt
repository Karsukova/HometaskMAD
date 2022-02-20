class Magazine (override val price: Double, override val wordCount: Int) :IPublication {
    override fun getType(): String {
        return if (wordCount> 0) "Magazine" else throw IllegalArgumentException ("Incorrect count")
    }
}