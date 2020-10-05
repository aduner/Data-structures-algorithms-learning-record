# Link: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

# class Solution:
#     def removeDuplicates(self, nums):
#         # 对列表进行循环修改时要使用nums[:]而不是nums
#         for n in nums[:]:
#             if nums.count(n) > 1:
#                 nums.remove(n)
#         return len(nums)

class Solution:
    def removeDuplicates(self, nums):
        nums[:] = list(sorted(set(nums)))
        return len(nums)