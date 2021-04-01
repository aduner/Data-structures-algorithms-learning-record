# Link: https://leetcode-cn.com/problems/count-and-say/
class Solution:
    # 递归方法
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return '1'
        s = self.countAndSay(n-1)
        i, res = 0, ''
        for j, c in enumerate(s):
            if c != s[i]:
                res += str(j-i) + s[i]
                i = j
        res += str(len(s) - i) + s[-1]  # 最后一个元素
        return res
    
    # 循环迭代
    # def countAndSay(self, n: int) -> str:
    #     res = '1'
    #     for _ in range(n-1):  
    #         i, tmp = 0, ''
    #         for j, c in enumerate(res):
    #             if c != res[i]:
    #                 tmp += str(j-i) + res[i]
    #                 i = j
    #         res = tmp + str(len(res) - i) + res[-1]
    #     return res

