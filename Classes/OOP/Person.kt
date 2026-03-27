class Person(val name: String, val lastName: String, var age: Int) { // constructor primary

    // the init block is executed automatically whenever the class is instantiated
    init {
       println("Welcome $name $lastName ...")
    }
    
    // "object" declares a singleton (only one instance in the entire program)
    object BIRTH{
        fun birth() = println("The birth this person was in the hospital") 
    }
    
    // "companion object" is a special object inside a class
    companion object {
        fun walk() = println("The person is walking now!")
        fun jump() = println("The person is jumping now!")
    }
    
    var birthday: String? = null
    
    // constructor secondary
    constructor(name: String, lastName: String, age: Int, birthday: String): this(name, lastName, age) {
        this.birthday = birthday
        
        println("\nCongratulations $name $lastName to your $age years. The date your birthday is $birthday")
        
    }
}