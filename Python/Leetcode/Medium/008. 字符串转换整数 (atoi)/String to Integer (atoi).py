# Link：https://leetcode-cn.com/problems/string-to-integer-atoi/
import re
class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        INT_MAX = 2147483647
        INT_MIN = -2147483648
        num_re = re.compile(r'^[\+\-]?\d+')
        num = num_re.findall(s)
        num = int(*num)
        return max(min(INT_MAX, num), INT_MIN)
