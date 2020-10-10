# Link: https://leetcode-cn.com/problems/two-sum/
class Solution:
    def twoSum(self, nums, target):
        dic = {}
        for index, value in enumerate(nums):
            if dic.get(target - value) != None:
                return [index, dic.get(target - value)]
            dic[value] = index

