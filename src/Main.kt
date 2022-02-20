import java.text.SimpleDateFormat
import java.util.*

fun buy(publication: IPublication){
    println("The purchase is complete. The purchase amount was €${publication.price}\n")
}


fun convertTime(systemTime: Long): String {
    return SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        .format(systemTime).toString()
}
fun main() {
    val book_1 = Book(31.50, 900)
    val book_2 = Book(48.00, 4500)
    val magazine = Magazine(30.00, 2900)

    book_1.info()
    book_2.info()
    magazine.info()

    println("\nReferential equality: " + (book_1 === book_2))
    println("Structural equality: " + (book_1 == book_2))

    var nullableBook_1: Book? = null
    var nullableBook_2: Book? = Book(17.00, 4000)

    nullableBook_1?.let { buy(it) }
    nullableBook_2?.let { buy(it) }

    val sum = {x: Int, y:Int -> x+y}
    println(sum(65, 41))

    val user = User(1, "Misha", 32, Type.DEMO)

    println(convertTime(user.strartTime))
    Thread.sleep(1000)
    println(convertTime(user.strartTime))

    val users = mutableListOf(user)
    users.apply {
        this.add(User(2, "Nikita", 45, Type.FULL))
        this.add(User(3, "Vika", 35, Type.DEMO))
        this.add(User(4, "Ivan", 23, Type.FULL))
        this.add(User(5, "Miron", 12, Type.FULL))
    }

    val fullAcess = users.filter { it.type == Type.FULL }

    val userNames = users.map { it.name }
    println(userNames.first())
    println(userNames.last())

    doAction(Registration)
    doAction(Login(users.first()))
    doAction(Logout)


}