package LeetCode.L034_在排序数组中查找元素的第一个和最后一个位置;

/**
 * @author Aduner
 */
public class Solution {
	public int[] searchRange(int[] nums, int target) {
		int leftIdx = findIndex(nums, target, true);
		int rightIdx = findIndex(nums, target, false) - 1;
		if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
			return new int[]{leftIdx, rightIdx};
		}
		return new int[]{-1, -1};
	}

	public int findIndex(int[] nums, int target, boolean lower) {
		int left = 0, right = nums.length - 1, index = nums.length;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] > target || (lower && nums[mid] >= target)) {
				right = mid - 1;
				index = mid;
			} else {
				left = mid + 1;
			}
		}
		return index;
	}
}
