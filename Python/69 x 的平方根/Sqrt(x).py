# Link: https://leetcode-cn.com/problems/sqrtx/
from math import sqrt


class Solution:
    # python内置方法
    # def mySqrt(self, x: int) -> int:
    #     a = sqrt(2)

    # 二分查找法
    def mySqrt(self, x: int) -> int:
        left, right = 0, x + 1
        while left < right:
            mid = left + (right - left) // 2
            if mid ** 2 == x:
                return mid
            if mid ** 2 < x:
                left = mid + 1
            else:
                right = mid
        return left-1
