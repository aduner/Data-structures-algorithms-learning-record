package JOffer.J56_数组中数字出现的次数II;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aduner
 */
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = nums.length - 1; i >= 0; --i) {
            int key = nums[i];
            int temp=map.getOrDefault(key,0);
            if (temp==0) {
                map.put(key, 1);
            } else if(temp==1) {
                map.put(key, -1);
            }else if(temp==-1){
                continue;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}