/**
 * 
 */
package com.leetcode;

import java.util.Arrays;

/**
 * @author Syed Irfan
 *
 */
public class TrappingWater {
	public static int trap(int[] arr) {
		int n = arr.length;
		int water = 0;
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(arr[i], left[i - 1]);
		}

		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(arr[i], right[i + 1]);
		}

		for (int i = 0; i < 1; i++) {
			water += Math.abs(Math.min(left[i], right[i]) - arr[i]);
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		return water;
	}
	
	public static void main(String[] args) {
		int[] in = {1,2,3};
		System.out.println(trap(in));
	}
}
