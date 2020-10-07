# Link: https://leetcode-cn.com/problems/plus-one/

class Solution:
    def plusOne(self, digits):
        num = ''
        for i in digits:
            num += str(i)
        return [int(i) for i in str(int(num)+1)]

    # 倒序遍历
    # def plusOne(self, digits):
    #     for i in range(len(digits)-1, -1, -1):
    #         if digits[i] is not 9:
    #             digits[i] += 1
    #             return digits
    #         else:
    #             digits[i] = 0
    #             if digits[0] is 0:
    #                 digits.insert(0, 1)
    #                 return digits
