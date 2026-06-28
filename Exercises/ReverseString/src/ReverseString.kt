class ReverseString {
    fun solution(s: CharArray): CharArray {
        if(s.isEmpty()) return s

        var storage: Char

        for(i in s.indices) {
            if(i >= s.size -1 - i) {
                return s
            }
            storage = s[i]
            s[i] = s[s.size -1 - i]
            s[s.size - 1 - i] = storage
        }
        return s
    }
}