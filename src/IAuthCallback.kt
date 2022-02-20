interface IAuthCallback{
    fun authSuccess()
    fun authFailed()

}
val authCallback = object: IAuthCallback{
    override fun authSuccess() {
        println("Auth success")
    }

    override fun authFailed() {
        println("Auth failed")
    }


}