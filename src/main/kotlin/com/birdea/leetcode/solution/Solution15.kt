package com.birdea.leetcode.solution

import java.util.ArrayList

class Solution15 {

    fun test() {
        threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    }

    fun threeSum(nums: IntArray): List<HashSet<Int>> {
        //i,j,k
        val length = nums.size
        //val items: MutableList<HashSet<Int>> = ArrayList()
        val set = HashSet<HashSet<Int>>()
        for (i in 0 until length) {
            for (j in i + 1 until length) {
                for (k in j + 1 until length) {
                    if (i != j && i != k && j != k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            println("found!$i,$j,$k -> ${nums[i]}, ${nums[j]}, ${nums[k]}")
                            var item = HashSet<Int>()
                            //val item: MutableList<Int> = ArrayList<Int>()
                            item.add(i)
                            item.add(j)
                            item.add(k)
                            set.add(item)
                        }
                    }
                }
            }
        }

        return ArrayList(set)
    }
}