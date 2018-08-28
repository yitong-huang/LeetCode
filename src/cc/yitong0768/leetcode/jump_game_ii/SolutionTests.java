package cc.yitong0768.leetcode.jump_game_ii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTests {

	Solution solution = new Solution();
	
	@Test
	public void test1() {
		int[] nums = {2,3,1,1,4};
		assertEquals(solution.jump(nums), 2);
	}
	
	@Test
	public void test2() {
		int[] nums = {2};
		assertEquals(solution.jump(nums), 0);
	}
		
}