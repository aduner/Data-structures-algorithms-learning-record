# Link: https://leetcode-cn.com/problems/single-number/
from functools import reduce
"""
reduce() 函数会对参数序列中元素进行累积。

函数将一个数据集合（链表，元组等）中的所有数据进行下列操作：用传给 reduce 中的函数 function（有两个参数）先对集合中的第 1、2 个元素进行操作，得到的结果再与第三个数据用 function 函数运算，最后得到一个结果。

reduce(lambda x, y: x+y, [1,2,3,4,5]) == 15

"""

class Solution:
    # 位运算,采用异或的方式
    def singleNumber(self, nums) -> int:
        return reduce(lambda x, y: x ^ y, nums)
