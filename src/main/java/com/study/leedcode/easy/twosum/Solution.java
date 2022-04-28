package com.study.leedcode.easy.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  Example 1:
			Input: nums = [2,7,11,15], target = 9
			Output: [0,1]
			Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	
  Example 2:
			Input: nums = [3,2,4], target = 6
			Output: [1,2]
			
  Example 3:
			Input: nums = [3,3], target = 6
			Output: [0,1]
 */

// 1. Two Sum
public class Solution {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		Solution solution = new Solution();
		int[] sum = solution.twoSum(nums, 9);
		System.out.println(Arrays.toString(sum));

	}

	public int[] twoSum(int[] nums, int target) {

		int[] datas = new int[2]; // new int[2];
		if (nums == null) {
			return datas;
		}

		Map<Integer, Integer> map = new HashMap<>();
		int key = 0;
		for (int i = 0; i <= nums.length; i++) {
			key = target - nums[i];
			if (map.containsKey(key)) {
				datas[0] = map.get(key);
				datas[1] = i;
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		return datas;
	}

}
