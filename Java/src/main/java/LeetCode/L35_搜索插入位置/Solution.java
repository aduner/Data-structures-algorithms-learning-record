package LeetCode.L35_搜索插入位置;

/**
 * @author Aduner
 */
public class Solution {
	public int searchInsert(int[] nums, int target) {
		int n = nums.length;
		int left = 0, right = n - 1, ans = n;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target <= nums[mid]) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int a = new Solution().searchInsert(new int[]{1, 3, 5, 6}, 2);
		System.out.println(a);
	}
}
