# Link: https://leetcode-cn.com/problems/search-insert-position/
class Solution:
    # 二分查找
    def searchInsert(self, nums, target):
        left, right = 0, len(nums)
        while left < right:
            mid = left+(right-left)//2
            if nums[mid] < target:
                left = mid+1
            else:
                right = mid
        return left

    # # python内置方法
    # def searchInsert(self, nums, target):
    #     if target in nums:
    #         return nums.index(target)
    #     else:
    #         nums.append(target)
    #         nums.sort()
    #         return nums.index(target)
