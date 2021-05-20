package JOffer.J51_数组中的逆序对;

/**
 * @author Aduner
 */
public class Solution {
    int[] nums, temp;
    public int reversePairs(int[] nums) {
        this.nums = nums;
        temp = new int[nums.length];
        return mergeSort(0, nums.length - 1);
    }
    private int mergeSort(int left, int right) {
        // 终止条件
        if (left >= right) return 0;
        // 递归划分
        int mid = (left + right) / 2;
        int res = mergeSort(left, mid) + mergeSort(mid + 1, right);
        // 合并阶段
        int l1 = left, l2 = mid + 1;
        for (int k = left; k <= right; k++)
            temp[k] = nums[k];
        for (int k = left; k <= right; k++) {
            if (l1 == mid + 1)
                nums[k] = temp[l2++];
            else if (l2 == right + 1 || temp[l1] <= temp[l2])
                nums[k] = temp[l1++];
            else {
                nums[k] = temp[l2++];
                // 统计逆序对
                res += mid - l1 + 1;
            }
        }
        return res;
    }
}