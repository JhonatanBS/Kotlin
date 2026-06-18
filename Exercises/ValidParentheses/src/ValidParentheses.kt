class ValidParentheses {
    fun isValid(s: String): Boolean {

        if (s.length % 2 != 0) return false

        val stack = mutableListOf<Char>()

        for (c in s) {
            when (c) {
                '(', '[', '{' -> stack.add(c)
                ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
                ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
                '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
            }
        }
        return stack.isEmpty()
    }
}