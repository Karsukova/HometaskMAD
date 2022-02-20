
interface IPublication{
    val price: Double
    val wordCount: Int
    fun getType(): String
}

fun IPublication.info(){
    println("Publication type: ${getType()}")
    println("Word count: $wordCount")
    println("Price €$price\n")
}
