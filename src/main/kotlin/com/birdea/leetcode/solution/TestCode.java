package com.birdea.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class TestCode {

    void test1() {
        int[] arr = {1,2,3};
        int target = 6;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (i+j == target) {
                    System.out.println("found!"+i+","+j);
                    break;
                }
            }
        }

    }

    public void test() {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        //i,j,k
        int length = nums.length;

        List<List<Integer>> items = new ArrayList<>();
        for (int i=0;i<length;i++) {
            for (int j=i+1;j<length;j++) {
                for (int k=j+1;j<length;k++) {
                    if (nums[i]+nums[j]+nums[k]==0) {
                        System.out.println("found!"+i+","+j+","+k);
                        List<Integer> item = new ArrayList();
                        item.add(i);
                        item.add(j);
                        item.add(k);
                        items.add(item);
                    }
                }
            }
        }
        return items;
    }
}
