class IntersectionOfTwoArrays {
    fun solution(nums1: IntArray, nums2: IntArray): IntArray {
        val list = mutableListOf<Int>()

        for(i in nums1) {
            for(j in nums2) {
                if(i == j && !list.contains(i)) {
                    list.add(i)
                }
            }
        }
        return list.toIntArray()
    }
}