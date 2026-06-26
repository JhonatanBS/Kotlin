class ValidAnagram {
    fun solution(wordOne: String, wordTwo: String): Boolean {
        if (wordOne.length != wordTwo.length) return false

        val list = wordTwo.toMutableList()

        for (i in wordOne) {
            if(list.contains(i)) {
                list.remove(i)
            }
        }

        return list.isEmpty()
    }
}