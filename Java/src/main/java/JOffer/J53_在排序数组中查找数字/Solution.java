package JOffer.J53_在排序数组中查找数字;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target)-binarySearch(nums,target-1);
    }
    private int binarySearch(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int middle=(left+right)/2;
            if(nums[middle]<=target) left=middle+1;
            else right=middle-1;
        }
        return left;
    }
}
