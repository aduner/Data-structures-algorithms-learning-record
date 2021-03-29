package LeetCode.L016_最接近的三数之和;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 99999999;

        // 枚举 a
        for (int a = 0; a < n; a++) {
            // 保证和上一次枚举的元素不相等
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            // 使用双指针枚举 b 和 c
            int b = a + 1, c = n - 1;
            while (b < c) {
                int sum = nums[a] + nums[b] + nums[c];
                // 如果和为 target 直接返回答案
                if (sum == target) {
                    return target;
                }
                // 根据差值的绝对值来更新答案
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    // 如果和大于 target，移动 c 对应的指针
                    int cc = c - 1;
                    // 移动到下一个不相等的元素
                    while (b < cc && nums[cc] == nums[c]) {
                        --cc;
                    }
                    c = cc;
                } else {
                    // 如果和小于 target，移动 b 对应的指针
                    int bb = b + 1;
                    // 移动到下一个不相等的元素
                    while (bb < c && nums[bb] == nums[b]) {
                        ++bb;
                    }
                    b = bb;
                }
            }
        }
        return best;
    }
}