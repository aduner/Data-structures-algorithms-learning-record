# Link：https://leetcode-cn.com/problems/regular-expression-matching/
from functools import lru_cache

class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        # 装饰符实现记忆化搜索，等价于Top-Down动态规划
        @lru_cache(None)
        def recur(i,j):
            # 结束条件
            if j==len(p): return i==len(s)
            # 首字母匹配
            first_match = (len(s) > i) and (p[j] == s[i] or p[j] == '.')
            # 处理 `*`
            if len(p) >=j+2 and p[j+1] == '*':
                return recur(i, j+2) or (first_match and recur(i+1, j))
            # 处理首字母匹配
            return first_match and recur(i+1, j+1)
        return recur(0,0)