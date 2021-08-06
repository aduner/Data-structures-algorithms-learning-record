package LeetCode.L704_二分查找;

/**
 * @author Aduner
 */
public class Solution {
	public int search(int[] nums, int target) {
		int index = 0;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			index = left + (right - left) / 2;
			if (nums[index] == target)
				return index;
			if (target < nums[index])
				right = index - 1;
			else
				left = index + 1;
		}
		return -1;
	}
}
