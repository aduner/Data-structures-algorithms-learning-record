# O(n) O(n)
# class Solution:
#     def majorityElement(self, nums):
#         result = {}
#         for i in nums:
#             if result.get(i):
#                 result[i] += 1
#             else:
#                 result[i] = 1
#             if result[i] > len(nums)/2:
#                 return i

# O(n) O(1)
class Solution:
    def majorityElement(self, nums):
        votes = 0
        for num in nums:
            if votes == 0:
                x = num
            votes += 1 if num == x else -1
        return x
