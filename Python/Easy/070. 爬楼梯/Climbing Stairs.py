# Link: https://leetcode-cn.com/problems/climbing-stairs/
import functools


class Solution:
    @functools.lru_cache(100)  # 缓存装饰器
    def climbStairs(self, n: int) -> int:
        if n == 1 or n == 2:
            return n
        return self.climbStairs(n-1) + self.climbStairs(n-2)

    # def climbStairs(self, n: int) -> int:
    #     if n == 1 or n == 2:
    #         return n
    #     a, b, temp = 1, 2, 0
    #     for i in range(3, n+1):
    #         temp = a + b
    #         a = b
    #         b = temp
    #     return temp
