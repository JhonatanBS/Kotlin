class Palindrome {
    fun solution(x: Int): Boolean {
        val palindrome = x.toString()

        if (x < 0) return false

        for (i in 0..< palindrome.length / 2) {
            if (palindrome[i] != palindrome[palindrome.length - 1 - i]) return false
        }
        return true
    }
}