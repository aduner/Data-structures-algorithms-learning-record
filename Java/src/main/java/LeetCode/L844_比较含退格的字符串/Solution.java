package LeetCode.L844_比较含退格的字符串;

/**
 * @author Aduner
 */
class Solution {
	public boolean backspaceCompare(String S, String T) {
		return build(S).equals(build(T));
	}

	public String build(String str) {
		StringBuffer ret = new StringBuffer();
		int length = str.length();
		for (int i = 0; i < length; ++i) {
			char ch = str.charAt(i);
			if (ch != '#') {
				ret.append(ch);
			} else {
				if (ret.length() > 0) {
					ret.deleteCharAt(ret.length() - 1);
				}
			}
		}
		return ret.toString();
	}
}