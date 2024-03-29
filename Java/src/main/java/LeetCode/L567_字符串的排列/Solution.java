package LeetCode.L567_字符串的排列;

import java.util.Arrays;

/**
 * @author Aduner
 */
public class Solution {
	public boolean checkInclusion(String s1, String s2) {
		int n = s1.length(), m = s2.length();
		if (n > m) {
			return false;
		}
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		for (int i = 0; i < n; ++i) {
			++cnt1[s1.charAt(i) - 'a'];
			++cnt2[s2.charAt(i) - 'a'];
		}
		if (Arrays.equals(cnt1, cnt2)) {
			return true;
		}
		for (int i = n; i < m; ++i) {
			++cnt2[s2.charAt(i) - 'a'];
			--cnt2[s2.charAt(i - n) - 'a'];
			if (Arrays.equals(cnt1, cnt2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		new Solution().checkInclusion(s1, s2);
	}
}
