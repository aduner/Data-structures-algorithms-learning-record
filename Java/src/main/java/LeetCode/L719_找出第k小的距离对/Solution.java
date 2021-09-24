package LeetCode.L719_找出第k小的距离对;

import java.util.Arrays;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        // 首先把数组进行排序，方便进行二分查找
        Arrays.sort(nums);
        // 这里的 low，指的是数组中两个数相差的最小值，high 是数组中两个值可能相差的最大值
        int low = 0, high = nums[nums.length - 1] - nums[0];
        while (low < high) {
            // 找到差值的中间值，并尝试以 mid 来看是不是差值小于等于 mid 的数对个数符合要求 k
            int mid = low + (high - low) / 2;
            // count 用来统计所有的符合要求的情况，left 指针用来标记循环遍历整个数组的左边界
            int count = 0, left = 0;
            for (int right = 0; right < nums.length; ++right) {
                // 在循环过程中，如果 nums[right] - nums[left] 大于了 mid，说明 left 太小了，这时候增大 left就可以使得数量减少
                while (nums[right] - nums[left] > mid) ++left;
                // 左右指针之间的数对都符合 nums[right] - nums[left] <= mid的要求
                count += right - left;
            }
            // 如果符合差值小于等于 mid 的数对个数太多了（count >= k） 那么就减小最高值
            if (count >= k) high = mid;
                // 否则说明数对个数太少了，需要加大阈值 mid
            else low = mid + 1;
        }
        // 到最后 low 就是最小的差值
        return low;
    }
}