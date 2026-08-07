class PlusOne {
    fun solution(digits: IntArray): IntArray {
        val listNumbers = mutableListOf<Int>()
        var aux = 1

        for(i in digits.indices.reversed()) {
            if(digits[i] == 9 && aux == 1) {
                listNumbers.add(0)
            }else if(aux == 1) {
                listNumbers.add(digits[i] + aux)
                aux = 0
            } else {
                listNumbers.add(digits[i])
            }
        }

        if(aux == 1) listNumbers.add(aux)

        listNumbers.reverse()
        return listNumbers.toIntArray()
    }
}