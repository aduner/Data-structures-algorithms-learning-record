package JOffer.J39_数组中出现次数超过一半的数字;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int n : nums) {
            if (sum == 0) {
                res = n;
            }
            if (n == res) {
                sum++;
            } else {
                sum--;
            }
        }
        return res;
    }

}
