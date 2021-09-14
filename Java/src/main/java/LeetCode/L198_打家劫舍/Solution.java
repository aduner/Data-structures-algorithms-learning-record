package LeetCode.L198_打家劫舍;

import java.util.Objects;

/**
 * @author Aduner
 */
public class Solution {
	public int rob(int[] nums) {
		if(Objects.equals(null,nums)||nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return nums[0];
		}
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[0],nums[1]);
		for(int i=2;i<nums.length;i++){
			dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
		}
		return dp[dp.length-1];
	}
}
