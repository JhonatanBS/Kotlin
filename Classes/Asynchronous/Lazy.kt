class Lazy {
    // `lazy` in Kotlin initializes a property only when it is first accessed and then reuses the same value for subsequent accesses
    val email: String by lazy {
    "teste@gmail.com"
    } 
    
    val password: String by lazy {
        "********"
    }
    
    fun loginUser(): String {
        return "Usuário: $email está logado e sua senha é $password"
    }
}