fun main() {
    val str = "Kotlin is language so good!"

    println("The size from string: ${str.length}")
    println("Position (index) 0 from string: ${str[0]}")
    println(str.startsWith("Kotlin"))
    println(str.endsWith("Show"))
    println(str.substring(4, 8))
    println(str.replace("good", "awesome"))
    println(str.lowercase())
    println(str.uppercase())

    println("        Hello, I'm Jhonatan. What's your name?           ".trim())
}