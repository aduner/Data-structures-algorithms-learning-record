package JOffer.J03_数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

public class Solution {
//    /**
//     * 空间换时间
//     * @param nums
//     * @return
//     */
//    public int findRepeatNumber(int[] nums) {
//        Set<Integer> set = new HashSet<Integer>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return num;
//            }
//        }
//        return -1;
//    }

    /**
     * 原地置换法
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}