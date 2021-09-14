package LeetCode.L191_位1的个数;

/**
 * @author Aduner
 */
public class Solution {
	public int hammingWeight(int n) {
		int ret = 0;
		while (n != 0) {
			n &= n - 1;
			ret++;
		}
		return ret;
	}
}
