package JOffer.J21_调整数组顺序使奇数位于偶数前面;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public int[] exchange(int[] nums) {
        int low=0;
        int fast=0;
        int temp;
        while (fast<nums.length){
            if((nums[fast]&1)==1){
                temp=nums[low];
                nums[low]=nums[fast];
                nums[fast]=temp;
                low++;
            }
            fast++;
        }
        return nums;
    }
    @Test
    public void test(){
        int[] a=exchange(new int[]{1,2,3,4});
        for(int i:a){
            System.out.println(i);
        }
    }
}
