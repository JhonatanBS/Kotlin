fun main() {

    // Null Safety
    
    val name: String? = "Carlos"
    val lastName: String? = null
    
    println(name!!.length)
    println(lastName?.length)
    
    /* 
    Exception in thread "main" java.lang.NullPointerException
        at MainKt.main(Main.kt:7)
        at MainKt.main(Main.kt)
    */
    
    if(name != null) {
        println("My name is $name")
    } else {
        println("Enter with data valid!!")
    }
}