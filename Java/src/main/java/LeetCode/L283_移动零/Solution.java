package LeetCode.L283_移动零;

/**
 * @author Aduner
 */
public class Solution {
	public void moveZeroes(int[] nums) {
		int len = nums.length;
		int numOfZeroes = nums[0] == 0 ? 1 : 0;
		for (int i = 1; i < len; i++) {
			if (nums[i] == 0) {
				numOfZeroes += 1;
			} else {
				if (numOfZeroes != 0) {
					nums[i - numOfZeroes] = nums[i];
					nums[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] i = new int[]{2,0,4,1,2,0, 1};
		solution.moveZeroes(i);
		for (int ii : i) {
			System.out.print(ii + ",");
		}

	}
}
