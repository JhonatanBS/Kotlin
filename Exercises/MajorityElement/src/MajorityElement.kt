class MajorityElement {
    fun solution(nums: IntArray): Int{
        val majority = nums.toList().groupingBy{it}.eachCount().maxBy { it.value }.key

        return majority

    }
}