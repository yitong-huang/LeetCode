package cc.yitong0768.leetcode.median_of_two_sorted_arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTests {

	Solution solution = new Solution();
	
	@Test
	public void test1() {
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		assertEquals(solution.findMedianSortedArrays(nums1, nums2), 2);
	}
	
	@Test
	public void test2() {
		int[] nums1 = {1, 3};
		int[] nums2 = {2, 4};
		assertEquals(solution.findMedianSortedArrays(nums1, nums2), 2.5);
	}
	
}
