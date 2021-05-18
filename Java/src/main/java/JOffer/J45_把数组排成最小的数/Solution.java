package JOffer.J45_把数组排成最小的数;

import org.junit.jupiter.api.Test;

/**
 * @author Aduner
 */
public class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }
    private void quickSort(String[] strs, int left, int right) {
        if(left >= right) return;
        int l = left, r = right;
        String tmp = strs[l];
        while(l < r) {
            while((strs[r] + strs[left]).compareTo(strs[left] + strs[r]) >= 0 && l < r) r--;
            while((strs[l] + strs[left]).compareTo(strs[left] + strs[l]) <= 0 && l < r) l++;
            tmp = strs[l];
            strs[l] = strs[r];
            strs[r] = tmp;
        }
        strs[l] = strs[left];
        strs[left] = tmp;
        quickSort(strs, left, l - 1);
        quickSort(strs, l + 1, right);
    }

}
