fun main() {
    var onConnect: Boolean = true // true or false
    var letter: Char = 'C'
    var name: String = "Carlos"
    var pi: Double = 10.5
    var equation: Float = 10f
    var liters: Long = 10L
    var age: Int = 31
    var code: Byte = 10

    println(onConnect)
    println(letter)
    println(name)
    println(pi)
    println(equation)
    println(liters)
    println(age)
    println(code)
    
    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}