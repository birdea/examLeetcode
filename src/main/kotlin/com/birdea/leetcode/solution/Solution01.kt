package com.birdea.leetcode.solution

class Solution01 {

    fun test() {
        //Input: nums = [3,2,4], target = 6
        //Output: [1,2]
        twoSum(intArrayOf(3,2,4), 6)
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        println("twoSum!$nums,target:$target")
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                println("i:$i,j:$j")
                if (nums[i] + nums[j] == target) {
                    println("found!$i,$j")
                    return intArrayOf(i,j)
                }
            }
        }
        return intArrayOf()
    }
}