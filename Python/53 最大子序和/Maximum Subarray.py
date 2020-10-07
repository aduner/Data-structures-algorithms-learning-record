# Link: https://leetcode-cn.com/problems/maximum-subarray/
class Solution:
    # 暴力法
    # def maxSubArray(self, nums) -> int:
    #     temp = nums[0]
    #     max_sum = temp
    #     for i in range(1, len(nums)):
    #         if temp+nums[i] > nums[i]:
    #             max_sum = max(temp+nums[i], max_sum)
    #             temp = temp+nums[i]
    #         else:
    #             max_sum = max(max_sum, temp, nums[i], temp+nums[i])
    #             temp = nums[i]
    #     return max_sum

    # 分治
    def maxSubArray(self, nums) -> int:
        n = len(nums)
        # 递归终止条件
        if n == 1:
            return nums[0]
        else:
            # 递归计算左半边最大子序和
            max_left = self.maxSubArray(nums[0:len(nums) // 2])
            # 递归计算右半边最大子序和
            max_right = self.maxSubArray(nums[len(nums) // 2:len(nums)])

        # 计算中间的最大子序和，从右到左计算左边的最大子序和，从左到右计算右边的最大子序和，再相加
        max_l = nums[len(nums) // 2 - 1]
        temp = 0
        for i in range(len(nums) // 2 - 1, -1, -1):
            temp += nums[i]
            max_l = max(temp, max_l)
        max_r = nums[len(nums) // 2]
        temp = 0
        for i in range(len(nums) // 2, len(nums)):
            temp += nums[i]
            max_r = max(temp, max_r)
        # 返回三个中的最大值
        return max(max_right, max_left, max_l+max_r)
