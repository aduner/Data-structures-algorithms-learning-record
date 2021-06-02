package JOffer.J57_和为s的连续正数序列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aduner
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        // 滑动窗口的左边界
        int left = 1;
        // 滑动窗口的右边界
        int right = 1;
        // 滑动窗口中数字的和
        int sum = 0;
        List<int[]> res = new ArrayList<>();

        while (left <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += right;
                right++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= left;
                left++;
            } else {
                // 记录结果
                int[] arr = new int[right-left];
                for (int k = left; k < right; k++) {
                    arr[k-left] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= left;
                left++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

}
