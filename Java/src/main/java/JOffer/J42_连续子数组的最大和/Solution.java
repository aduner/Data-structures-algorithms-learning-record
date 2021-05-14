package JOffer.J42_连续子数组的最大和;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int n:nums){
            sum+=n;
            if(sum>res) res=sum;
            if(sum<0) sum=0;
        }
        return res;
    }
    @Test
    void test(){
        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}
