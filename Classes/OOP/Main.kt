fun main() {

    println("What's your name?")
    val name = readln()
    
    println("and your last name?")
    val lastName = readln()
    
    println("What's your age?")
    var age = readln().toIntOrNull() ?: 0
    
    var day: String? = null
    var month: String? = null
    var year: String? = null
    
    while(day.isNullOrBlank() || month.isNullOrBlank() || year.isNullOrBlank()) {
        println("What's your day of bithday?")
        day = readln()
        
        println("What's your month of bithday?")
        month = readln()
        
        println("What's your year of bithday?")
        year = readln()
    }
    
    Person(name, lastName, age, "$day/$month/$year")
    
    var developer: Int = 1
    
    do {
    
    println("""Choose your level developer:\n
    1 -> Junior
    2 -> Mid
    3 -> Senior
    """)
    
    developer = readln().toInt()
        
    } while(developer < 0 || developer > 3)
    
    when(developer) {
        1 -> println("Congratulation: You're ${Salary.INITIAL.developer} developer with  ${Salary.INITIAL.value}")
        2 -> println("Congratulation: You're ${Salary.MEDIUM.developer} developer with ${Salary.MEDIUM.value}")
        3 -> println("Congratulation: You're ${Salary.ADVANCE.developer} developer with ${Salary.ADVANCE.value}")
        else -> println("EXIT")
    }
    
    Person.walk()
    Person.jump()
    Person.birth.birth()
}
