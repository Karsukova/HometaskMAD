sealed class Action
object Registration : Action()
class Login(val user: User) : Action()
object Logout : Action()


fun doAction(action: Action) {
    when (action) {
        is Registration -> println("\nRegistration has started.")
        is Login -> {
            println("Auth has started.")
            auth(action.user, ::updateCache)
        }
        is Logout -> print("Logout has started.")
    }
}

inline fun auth(user: User, func: () -> Unit) =
    try {
        user.check18()
        authCallback.authSuccess()
        func()
    } catch (e: Exception) {
        println(e.message)
        authCallback.authFailed()
    }

fun updateCache() {
    println("Cache was updated.")
}