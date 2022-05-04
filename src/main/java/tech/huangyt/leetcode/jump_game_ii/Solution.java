package tech.huangyt.leetcode.jump_game_ii;

class Solution {
	public int jump(int[] nums) {

		int step = 0;
		
		for (int i=nums.length-1; i>0;) {
			i = jumpFromEnd(nums, i);
			step ++;
		}
		
		return step;
	}
	
	// return the minimum index can jump to the lastIndex
	public int jumpFromEnd(int[] nums, int lastIndex) {

		int index = lastIndex - 1;
		
		for (int i = index-1; i >=0; i--) {
			if (lastIndex - i <= nums[i]) {
				index = i;
			}
		}
		
		return index;
	}
}