package cc.yitong0768.leetcode.median_of_two_sorted_arrays;

/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 *   nums1 = [1, 3]
 *   nums2 = [2]
 *   The median is 2.0
 * Example 2:
 *   nums1 = [1, 2]
 *   nums2 = [3, 4]
 *   The median is (2 + 3)/2 = 2.5
 */

public class Solution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] A = nums1;
		int[] B = nums2;

		// A is the array with fewer elements
		if (nums1.length > nums2.length) {
			A = nums2;
			B = nums1;
		}

		int m = A.length;
		int n = B.length;
		int imin = 0;
		int imax = m;

		while (imin <= imax) {
			int i = (imax + imin) / 2;
			int j = (m + n + 1) / 2 - i;

			if (i < m && B[j - 1] > A[i]) { // A[i] is too small, we need to increase i.
				imin = i + 1;
				continue;
			} else if (i > 0 && A[i - 1] > B[j]) { // A[i] is too big, we need to decrease i.
				imax = i - 1;
				continue;
			} else { // found i.
				int maxLeft, minRight;
				if (i == 0)
					maxLeft = B[j - 1];
				else if (j == 0)
					maxLeft = A[i - 1];
				else
					maxLeft = Math.max(A[i - 1], B[j - 1]);

				if ((m + n) % 2 == 1)
					return maxLeft;

				if (i == m)
					minRight = B[j];
				else if (j == n)
					minRight = A[i];
				else
					minRight = Math.min(A[i], B[j]);

				return (minRight + maxLeft) / 2.0;

			}
		}
		// impossible to be here
		return 0;
	}
}
