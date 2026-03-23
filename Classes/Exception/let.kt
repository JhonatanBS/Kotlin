fun let() {

    val database: String? = "Pessoa"
    
    /* The value is executed when the value isn't null*/

    database?.let {
        println(database.length)
        println(database[4])
        println(database.split("ss"))
    }
}