package LeetCode.L977_有序数组的平方;

/**
 * @author Aduner
 */
public class Solution {
	public int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;
		int index = nums.length - 1;
		while (left<=right){
			int l=nums[left]*nums[left];
			int r=nums[right]*nums[right];
			if(l>=r){
				result[index]=l;
				left++;
			}else{
				result[index]=r;
				right--;
			}
			index--;
		}
		return result;
	}
}
