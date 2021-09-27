package LeetCode.L153_寻找旋转排序数组中的最小值;

/**
 * @author Aduner
 */
public class Solution {
	public int findMin(int[] nums) {
		int l=0;
		int r=nums.length-1;
		while (l<r){
			int mid=(l+r)/2;
			if (nums[mid] < nums[r]) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return nums[l];
	}
}
