package com.agsoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairOfElements {
	public static void main(String[] args) {
		int[] arr = { 13, 7, 8, 2, 6, 5, 1, 4 };
		int key = 6;

		// findPairEle(arr, key);
		findPair(arr, key);
	}

	private static void findPair(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				System.out.println("Pair is found :(" + (target - nums[i]) + "," + nums[i] + ")");
				return;
			}
			map.put(nums[i], i);
		}
		System.out.println("Pair not found in the array");
	}

	private static void findPairEle(int[] arr, int key) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] + arr[right] == key) {
				System.out.println(arr[left] + " " + arr[right]);
				left++;
				right--;
			} else if (arr[left] + arr[right] < key) {
				left++;
			} else {
				right--;
			}
		}
	}
}
