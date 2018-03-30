package cc.yitong0768.leetcode.trapping_rain_water;

/* Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.
 * 
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * |       *
 * |   *   ** *
 * |_*_**_******__
 * 
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
 * In this case, 6 units of rain water (blue section) are being trapped. 
 * Thanks Marcos for contributing this image!
 */

public class Solution {

	public int trap(int[] height) {

		int[] left = new int[height.length];
		int[] right = new int[height.length];

		int max = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > max)
				max = height[i];
			left[i] = max;
		}

		max = 0;
		for (int i = height.length - 1; i >= 0; i--) {
			if (height[i] > max)
				max = height[i];
			right[i] = max;
		}

		int result = 0;
		for (int i = 0; i < height.length; i++) {
			result += (Math.min(left[i], right[i]) - height[i]);
		}

		return result;
	}

}
