fun main() {

    val liters: ULong = 10u
    val age: UInt = 31u
    val code: UByte = 255u

    println(liters)
    println(age)
    println(code)

    println("Long MAX ${ULong.MAX_VALUE} - MIN ${ULong.MIN_VALUE}")
    println("Int MAX ${UInt.MAX_VALUE} - MIN ${UInt.MIN_VALUE}")
    println("Short MAX ${UShort.MAX_VALUE} - MIN ${UShort.MIN_VALUE}")
    println("Byte MAX ${UByte.MAX_VALUE} - MIN ${UByte.MIN_VALUE}")
}