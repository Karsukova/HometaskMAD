class User(
    val id: Int,
    val name: String,
    val age: Int,
    val type: Type
) {
    val strartTime: Long by lazy {
        System.currentTimeMillis()
    }
}

fun User.check18(){
    if(age>=18){
        println("User is over 18")
    } else throw Exception("User is under 18")
}