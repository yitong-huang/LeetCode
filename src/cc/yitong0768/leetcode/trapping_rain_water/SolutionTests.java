package cc.yitong0768.leetcode.trapping_rain_water;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTests {

	Solution solution = new Solution();

	@Test
	public void test1() {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		assertEquals(solution.trap(arr), 6);
	}

}
