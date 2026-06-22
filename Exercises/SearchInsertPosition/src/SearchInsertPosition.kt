class SearchInsertPosition {
    fun solution(nums: IntArray, target: Int): Int {
        if(nums.isEmpty()) return 0

        nums.forEachIndexed { index, value ->
            if(value >= target) return index
        }
        return nums.size
    }
}