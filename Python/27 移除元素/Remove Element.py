# Link: https://leetcode-cn.com/problems/remove-element/

class Solution:
    def removeElement(self, nums, val):
        for i in nums[:]:
            if i == val:
                nums.remove(i)
        return len(nums)