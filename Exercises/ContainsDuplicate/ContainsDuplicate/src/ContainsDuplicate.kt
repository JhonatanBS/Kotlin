class ContainsDuplicate {
    fun solution(nums: IntArray): Boolean {
        for((index, value) in nums.withIndex()) {
            for(j in index + 1..< nums.size) {
                if(value == nums[j]) return true
            }
        }
        return false
    }
}