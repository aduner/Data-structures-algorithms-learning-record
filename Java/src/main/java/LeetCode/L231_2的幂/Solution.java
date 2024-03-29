package LeetCode.L231_2的幂;

/**
 * @author Aduner
 */
public class Solution {
	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().isPowerOfTwo(6));
	}
}
