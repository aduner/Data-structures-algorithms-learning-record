package LeetCode.L015_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int a, b, c;
        int len = nums.length;
        for (a = 0; a < len; a++) {
            if (a != 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            c = len - 1;
            for (b = a + 1; b < len; b++) {
                if (b != a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }
                while (b < c && nums[a] + nums[b] + nums[c] > 0) {
                    c--;
                }
                if(b==c){
                    break;
                }
                if(nums[a] + nums[b] + nums[c] == 0){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[a]);
                    list.add(nums[b]);
                    list.add(nums[c]);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
