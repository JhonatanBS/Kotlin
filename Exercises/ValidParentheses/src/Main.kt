fun main(args: Array<String>) {
   println(ValidParentheses().isValid("()"))
   println(ValidParentheses().isValid("()[]{}"))
   println(ValidParentheses().isValid("(]"))
   println(ValidParentheses().isValid("([])"))
   println(ValidParentheses().isValid("([)]"))
}