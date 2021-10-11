package LeetCode.L713_乘积小于K的子数组;

/**
 * @author Aduner
 */
public class Solution {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k <= 1) return 0;
		int l = 0,r = 0;
		int ans = 0;
		int base = 1;
		while(r < nums.length){
			base *= nums[r];
			while(base >= k) base /= nums[l++];
			ans += r-l+1;
			r++;
		}
		return ans;
	}
}