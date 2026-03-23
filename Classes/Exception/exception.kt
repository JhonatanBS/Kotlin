fun exception() {
    
    try{
        val result = 10 / 0
        println("Erro: $result")
        
        val fruit: String? = null
        println(fruit?.length)
        
        val salads: Array<String> = arrayOf("Potato", "Corn")
        println(salads[100])
        
    } catch (error: ArithmeticException) {
        println("Error ArithmeticException: ${error.message}")
    } catch (error: NullPointerException) {
         println("Error NullPointerException: ${error.message}")
    } catch (error: IndexOutOfBoundsException) {
         println("Error IndexOutOfBoundsException: ${error.message}")
    } catch (error: Exception) {
         println("Error: ${error.message}")
    } finally {
        print("Closing program...")
    }
}