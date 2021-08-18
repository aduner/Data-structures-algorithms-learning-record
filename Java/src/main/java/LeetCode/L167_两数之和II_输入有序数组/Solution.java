package LeetCode.L167_两数之和II_输入有序数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aduner
 */
public class Solution {
	/**
	 * map辅助
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer,Integer> map =new HashMap<>();
		for(int i = 0; i<numbers.length; i++){
			if(map.containsKey(numbers[i])){
				return new int[] {map.get(numbers[i])+1,i+1};
			}else {
				map.put(target-numbers[i],i);
			}
		}
		return null;
	}

	/**
	 * 双指针
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum_(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[] {left + 1, right + 1};
			}
			if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[0];
	}
}
