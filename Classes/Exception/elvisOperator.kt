fun elvisOperator() {
    print("Please, enter some value for test the Elvis Operator: ")
    val input = readln().toIntOrNull()
    
    val age: Int? = input ?: null
    
    if(age != null) {
        println("The value typed is $age")
    } else {
        println("You aren't type any value!!!")
    }
}