class RomanToInteger {
    fun solve(numberRoman: String): Int {
        if (numberRoman.isEmpty()) return 0

        val romanMap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var sumAllNumbers = 0
        var previousValue = 0

        for (number in numberRoman) {
            val currentValue = romanMap[number] ?: 0

            if (currentValue > previousValue) {
                sumAllNumbers += currentValue - 2 * previousValue
            } else {
                sumAllNumbers += currentValue
            }

            previousValue = currentValue
        }

        return sumAllNumbers
    }
}