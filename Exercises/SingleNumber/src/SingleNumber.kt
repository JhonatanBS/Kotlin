class SingleNumber {
    fun solution(nums: IntArray):Int {
        val numberNoRepeat: MutableList<Int> = MutableList(nums.size) {0}

        for (i in nums.indices) {
            for (j in i+1..<nums.size) {
                if(nums[i] == nums[j]){
                    numberNoRepeat[i] = 1
                    numberNoRepeat[j] = 1
                }
            }
        }
        return nums[numberNoRepeat.indexOf(0)]
    }
}

/*
class SingleNumber {
    fun solution(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}
*/