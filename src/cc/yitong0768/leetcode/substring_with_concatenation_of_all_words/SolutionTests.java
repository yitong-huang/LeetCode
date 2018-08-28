package cc.yitong0768.leetcode.substring_with_concatenation_of_all_words;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SolutionTests {

	Solution solution = new Solution();

	@Test
	public void test1() {
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		List<Integer> result = solution.findSubstring(s, words);
		assertEquals(result.size(), 2);
		assertEquals(result.get(0), new Integer(0));
		assertEquals(result.get(1), new Integer(9));
	}

	@Test
	public void test2() {
		String s = "wordgoodstudentgoodword";
		String[] words = { "word", "student" };
		assertEquals(solution.findSubstring(s, words).size(), 0);
	}

	@Test
	public void test3() {
		String s = "";
		String[] words = {};
		assertEquals(solution.findSubstring(s, words).size(), 0);
	}
	
}