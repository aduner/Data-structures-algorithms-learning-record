package LeetCode.L278_第一个错误的版本;

/**
 * @author Aduner
 */
public class Solution {
	public int firstBadVersion(int n) {
		int left = 1, right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	private boolean isBadVersion(int n) {
		return true;
	}
}
