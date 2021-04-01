# Link: https://leetcode-cn.com/problems/pascals-triangle/
class Solution:
    # def generate(self, numRows: int):
    #     if numRows == 0:
    #         return []
    #     if numRows == 1:
    #         return [[1]]
    #     res = [[1]]
    #     num = 1
    #     while num < numRows:
    #         row = []
    #         for i in range(num+1):
    #             if i == 0 or i == num:
    #                 value = 1
    #             else:
    #                 value = res[num-1][i-1]+res[num-1][i]
    #             row.append(value)
    #         res.append(row)
    #         num += 1
    #     return res

    def generate(self, numRows: int):
        # 精简
        if numRows == 0:
            return []
        res = [[1]]
        while len(res) < numRows:
            newRow = [a+b for a, b in zip([0]+res[-1], res[-1]+[0])]
            res.append(newRow)
        return res
