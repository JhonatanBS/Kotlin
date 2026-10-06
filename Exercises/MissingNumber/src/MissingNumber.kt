class MissingNumber {
    fun solution(nums: IntArray): Int {
        var foundNumber = 0

        for(i in nums) {
            if(nums.contains(foundNumber)) {
                foundNumber++
            } else {
                return foundNumber
            }
        }

        return foundNumber
    }
}