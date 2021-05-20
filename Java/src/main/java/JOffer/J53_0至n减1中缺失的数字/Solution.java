package JOffer.J53_0至n减1中缺失的数字;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
         while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == middle) left = middle + 1;
            else right = middle - 1;
        }
        return left;
    }
    @Test
    void test(){
        System.out.println(missingNumber(new int[]{1}));
    }
}
