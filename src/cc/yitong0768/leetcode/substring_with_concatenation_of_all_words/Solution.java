package cc.yitong0768.leetcode.substring_with_concatenation_of_all_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> result = new ArrayList<>();
		
		if (s.length()<1 || words == null || words.length < 1) {
			return result;
		}
		
		Map<String, Integer> wordMap = new HashMap<>();
		for (String word : words) {
			wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
		}

		int wordLength = words[0].length();
		int wordCount = words.length;

		for (int i = 0; i < s.length() - wordCount * wordLength + 1; i++) {
			int j = 0;
			Map<String, Integer> visited = new HashMap<>();
			while (j < wordCount) {
				String tempWord = s.substring(i + j * wordLength, i + j * wordLength + wordLength);
				if (wordMap.containsKey(tempWord)) {
					visited.put(tempWord, visited.getOrDefault(tempWord, 0) + 1);
					if (visited.get(tempWord) > wordMap.get(tempWord)) {
						break;
					}
				} else {
					break;
				}
				j++;
			}
			if (j == wordCount) {
				result.add(i);
			}
		}

		return result;
	}
}